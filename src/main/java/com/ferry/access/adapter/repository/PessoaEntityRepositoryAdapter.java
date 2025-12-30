package com.ferry.access.adapter.repository;

import com.ferry.access.adapter.entity.PessoaEntity;
import com.ferry.access.core.domain.Pessoa;
import com.ferry.access.core.port.PessoaEntityRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class PessoaEntityRepositoryAdapter implements PessoaEntityRepositoryPort {
    private final PessoaEntityRepository pessoaEntityRepository;
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public Pessoa create(Pessoa pessoa) {
        return modelMapper.map(pessoaEntityRepository.save(modelMapper.map(pessoa, PessoaEntity.class)), Pessoa.class);
    }
}
