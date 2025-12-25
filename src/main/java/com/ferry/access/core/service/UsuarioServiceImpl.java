package com.ferry.access.core.service;

import com.ferry.access.core.domain.Usuario;
import com.ferry.access.core.port.UsuarioEntityRepositoryPort;
import com.ferry.access.core.port.UsuarioServicePort;

public class UsuarioServiceImpl implements UsuarioServicePort {
    private final UsuarioEntityRepositoryPort usuarioEntityRepositoryPort;

    public UsuarioServiceImpl(UsuarioEntityRepositoryPort usuarioEntityRepositoryPort) {
        this.usuarioEntityRepositoryPort = usuarioEntityRepositoryPort;
    }

    @Override
    public Usuario create(Usuario usuario) {
        return usuarioEntityRepositoryPort.create(usuario);
    }
}
