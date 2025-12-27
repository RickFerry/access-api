package com.ferry.access.adapter.repository;

import com.ferry.access.adapter.entity.PessoaEntity;
import com.ferry.access.adapter.entity.VisitanteEntity;
import com.ferry.access.core.domain.Visitante;
import com.ferry.access.core.port.VisitanteEntityRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class VisitanteEntityRepositoryAdapter implements VisitanteEntityRepositoryPort {
    private final VisitanteEntityRepository visitanteEntityRepository;
    private final PessoaEntityRepository pessoaEntityRepository;
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public Visitante create(Visitante entity) {
        PessoaEntity pessoaSalva = pessoaEntityRepository.findById(entity.getPessoa().getId()).orElseThrow(() ->
                new IllegalArgumentException("Pessoa com id " + entity.getPessoa().getId() + " não encontrada"));

        VisitanteEntity visitanteMapeado = modelMapper.map(entity, VisitanteEntity.class);
        visitanteMapeado.setPessoa(pessoaSalva);
        VisitanteEntity visitanteSalvo = visitanteEntityRepository.save(visitanteMapeado);
        return modelMapper.map(visitanteSalvo, Visitante.class);
    }
}
