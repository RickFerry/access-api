package com.ferry.access.adapter.converter;

import com.ferry.access.adapter.dto.MoradorDto;
import com.ferry.access.core.domain.Morador;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MoradorConverter {
    private final ModelMapper modelMapper;

    public Morador toEntity(MoradorDto dto) {
        modelMapper.typeMap(MoradorDto.class, Morador.class);
        return modelMapper.map(dto, Morador.class);
    }

    public MoradorDto toDto(Morador morador) {
        modelMapper.typeMap(Morador.class, MoradorDto.class);
        return modelMapper.map(morador, MoradorDto.class);
    }
}
