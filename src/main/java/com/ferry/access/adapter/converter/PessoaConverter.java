package com.ferry.access.adapter.converter;

import com.ferry.access.adapter.dto.PessoaDto;
import com.ferry.access.core.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PessoaConverter {
    private final ModelMapper modelMapper;

    public Pessoa toEntity(PessoaDto dto) {
        modelMapper.typeMap(PessoaDto.class, Pessoa.class);
        return modelMapper.map(dto, Pessoa.class);
    }

    public PessoaDto toDto(Pessoa pessoa) {
        modelMapper.typeMap(Pessoa.class, PessoaDto.class);
        return modelMapper.map(pessoa, PessoaDto.class);
    }
}
