package com.ferry.access.adapter.dto;

import com.ferry.access.core.domain.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoradorDto {
    private Long id;
    private String cpf;
    private String endereco;
    private String celular;
    private Pessoa pessoa;
}
