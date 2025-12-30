package com.ferry.access.adapter.controller;

import com.ferry.access.adapter.converter.PessoaConverter;
import com.ferry.access.adapter.dto.PessoaDto;
import com.ferry.access.core.port.PessoaServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/pessoas")
public class PessoaController {
    private final PessoaServicePort pessoaService;
    private final PessoaConverter pessoaConverter;

    @PostMapping
    public ResponseEntity<PessoaDto> create(@RequestBody PessoaDto pessoaDto) {
        return ResponseEntity.ok(pessoaConverter.toDto(pessoaService.create(pessoaConverter.toEntity(pessoaDto))));
    }
}
