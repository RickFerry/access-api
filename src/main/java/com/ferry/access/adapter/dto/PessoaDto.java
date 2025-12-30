package com.ferry.access.adapter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 171475502468939990L;

    private Long id;
    private String nome;
}
