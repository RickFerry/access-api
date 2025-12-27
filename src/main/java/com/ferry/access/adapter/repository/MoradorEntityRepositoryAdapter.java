package com.ferry.access.adapter.repository;

import com.ferry.access.adapter.entity.MoradorEntity;
import com.ferry.access.adapter.entity.PessoaEntity;
import com.ferry.access.core.domain.Morador;
import com.ferry.access.core.port.MoradorEntityRepositoryPort;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class MoradorEntityRepositoryAdapter implements MoradorEntityRepositoryPort {
    private final MoradorEntityRepository moradorRepository;
    private final PessoaEntityRepository pessoaRepository;
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public Morador create(Morador morador) {
        PessoaEntity pessoaEntity = null;

        if (morador.getPessoa() != null && morador.getPessoa().getId() != null) {
            pessoaEntity = pessoaRepository.findById(morador.getPessoa().getId())
                    .orElseThrow(() -> new EntityNotFoundException(
                            "Pessoa não encontrada com id: " + morador.getPessoa().getId()));
        } else if (morador.getPessoa() != null) {
            pessoaEntity = modelMapper.map(morador.getPessoa(), PessoaEntity.class);
            pessoaEntity = pessoaRepository.save(pessoaEntity);
        }

        var moradorEntity = modelMapper.map(morador, MoradorEntity.class);
        moradorEntity.setPessoa(pessoaEntity);

        var saved = moradorRepository.save(moradorEntity);
        return modelMapper.map(saved, Morador.class);
    }
}
