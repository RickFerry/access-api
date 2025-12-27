package com.ferry.access.adapter.controller;

import com.ferry.access.adapter.converter.UsuarioConverter;
import com.ferry.access.adapter.dto.UsuarioDto;
import com.ferry.access.core.port.UsuarioServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/usuarios")
public class UsuarioController {
    private final UsuarioServicePort usuarioService;
    private final UsuarioConverter usuarioConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDto create(@RequestBody UsuarioDto usuario) {
        return usuarioConverter.toDto(usuarioService.create(usuarioConverter.toEntity(usuario)));
    }
}
