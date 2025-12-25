package com.ferry.access.core.port;

import com.ferry.access.core.domain.Usuario;

import java.util.Optional;

public interface UsuarioServicePort {
    Optional<Usuario> create(Usuario usuario);
}
