package com.ferry.access.adapter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto implements Serializable {
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private Boolean administrador;
}