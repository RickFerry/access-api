package com.ferry.access.adapter.converter;

import com.ferry.access.adapter.dto.VisitanteDto;
import com.ferry.access.core.domain.Visitante;
import org.springframework.stereotype.Component;

@Component
public class VisitanteConverter {

    public Visitante toEntity(VisitanteDto dto) {
        if (dto == null) {
            return null;
        }
        Visitante visitante = new Visitante();
        visitante.setId(dto.getId());
        visitante.setRg(dto.getRg());
        visitante.setPessoa(dto.getPessoa());
        return visitante;
    }

    public VisitanteDto toDto(Visitante visitante) {
        if (visitante == null) {
            return null;
        }
        VisitanteDto dto = new VisitanteDto();
        dto.setId(visitante.getId());
        dto.setRg(visitante.getRg());
        dto.setPessoa(visitante.getPessoa());
        return dto;
    }
}
