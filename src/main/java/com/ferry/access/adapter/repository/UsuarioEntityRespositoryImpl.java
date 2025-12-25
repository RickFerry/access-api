package com.ferry.access.adapter.repository;

import com.ferry.access.adapter.entity.UsuarioEntity;
import com.ferry.access.core.domain.Usuario;
import com.ferry.access.core.port.UsuarioEntityRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioEntityRespositoryImpl implements UsuarioEntityRepositoryPort {
    private final UsuarioEntityRepository usuarioEntityRepository;
    private final ModelMapper modelMapper;

    @Override
    public Usuario create(Usuario usuario) {
        return modelMapper.map(
                usuarioEntityRepository.save(
                        modelMapper.map(usuario, UsuarioEntity.class)
                ),
                Usuario.class
        );
    }
}
