package com.ferry.access.adapter.dto;

import com.ferry.access.core.domain.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 17147550246893210L;

    private Long id;
    private String email;
    private String senha;
    private Boolean administrador;
    private PessoaDto pessoa;
}