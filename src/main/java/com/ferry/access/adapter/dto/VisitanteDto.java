package com.ferry.access.adapter.dto;

import com.ferry.access.core.domain.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitanteDto {
    private Long id;
    private String rg;
    private Pessoa pessoa;
}
