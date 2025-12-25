package com.ferry.access.core.service;

import com.ferry.access.core.domain.Usuario;
import com.ferry.access.core.port.UsuarioServicePort;

import java.util.Optional;

public class UsuarioServiceImpl implements UsuarioServicePort {
    @Override
    public Optional<Usuario> create(Usuario usuario) {
        return Optional.empty();
    }
}
