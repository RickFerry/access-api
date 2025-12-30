package com.ferry.access.adapter.converter;

import com.ferry.access.adapter.dto.UsuarioDto;
import com.ferry.access.core.domain.Usuario;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioConverter {
    private final ModelMapper modelMapper;

    public Usuario toEntity(UsuarioDto usuarioDto) {
        modelMapper.typeMap(Usuario.class, Usuario.class);
        return modelMapper.map(usuarioDto, Usuario.class);
    }

    public UsuarioDto toDto(Usuario usuario) {
        modelMapper.typeMap(Usuario.class, UsuarioDto.class);
        return modelMapper.map(usuario, UsuarioDto.class);
    }
}
