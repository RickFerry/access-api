package com.ferry.access.adapter.converter;

import com.ferry.access.adapter.dto.UsuarioDto;
import com.ferry.access.core.domain.Pessoa;
import com.ferry.access.core.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {

    public Usuario toEntity(UsuarioDto usuarioDto) {
        if (usuarioDto == null) {
            return null;
        }
        Usuario usuario = new Usuario();
        usuario.setId(usuarioDto.getId());
        usuario.setEmail(usuarioDto.getEmail());
        usuario.setSenha(usuarioDto.getSenha());
        usuario.setAdministrador(usuarioDto.getAdministrador());
        usuario.setPessoa(new Pessoa(null, usuarioDto.getNome()));
        return usuario;
    }

    public UsuarioDto toDto(Usuario usuario) {
        if (usuario == null) {
            return null;
        }
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setId(usuario.getId());
        usuarioDto.setEmail(usuario.getEmail());
        usuarioDto.setSenha(usuario.getSenha());
        usuarioDto.setAdministrador(usuario.getAdministrador());
        usuarioDto.setNome(usuario.getPessoa().getNome());
        return usuarioDto;
    }
}
