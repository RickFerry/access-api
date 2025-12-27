package com.ferry.access.adapter.converter;

import com.ferry.access.adapter.dto.MoradorDto;
import com.ferry.access.core.domain.Morador;
import org.springframework.stereotype.Component;

@Component
public class MoradorConverter {

    public Morador toEntity(MoradorDto dto) {
        if (dto == null) {
            return null;
        }
        Morador morador = new Morador();
        morador.setId(dto.getId());
        morador.setCpf(dto.getCpf());
        morador.setEndereco(dto.getEndereco());
        morador.setCelular(dto.getCelular());
        morador.setPessoa(dto.getPessoa());
        return morador;
    }

    public MoradorDto toDto(Morador morador) {
        if (morador == null) {
            return null;
        }
        MoradorDto dto = new MoradorDto();
        dto.setId(morador.getId());
        dto.setCpf(morador.getCpf());
        dto.setEndereco(morador.getEndereco());
        dto.setCelular(morador.getCelular());
        dto.setPessoa(morador.getPessoa());
        return dto;
    }
}
