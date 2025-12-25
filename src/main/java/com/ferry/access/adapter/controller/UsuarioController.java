package com.ferry.access.adapter.controller;

import com.ferry.access.adapter.dto.UsuarioDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDto create(@RequestBody UsuarioDto usuario) {
        return usuario;
    }
}
