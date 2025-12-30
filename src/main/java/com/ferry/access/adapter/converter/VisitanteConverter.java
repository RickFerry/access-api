package com.ferry.access.adapter.converter;

import com.ferry.access.adapter.dto.VisitanteDto;
import com.ferry.access.core.domain.Visitante;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class VisitanteConverter {
    private final ModelMapper modelMapper;

    public Visitante toEntity(VisitanteDto dto) {
        modelMapper.typeMap(VisitanteDto.class, Visitante.class);
        return modelMapper.map(dto, Visitante.class);
    }

    public VisitanteDto toDto(Visitante visitante) {
        modelMapper.typeMap(Visitante.class, VisitanteDto.class);
        return modelMapper.map(visitante, VisitanteDto.class);
    }
}
