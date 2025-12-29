package com.ferry.access.adapter.controller;

import com.ferry.access.adapter.converter.VisitanteConverter;
import com.ferry.access.adapter.dto.VisitanteDto;
import com.ferry.access.core.port.VisitanteServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/visitantes")
public class VisitanteController {
    private final VisitanteConverter visitanteConverter;
    private final VisitanteServicePort port;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VisitanteDto create(@RequestBody VisitanteDto dto) {
        return visitanteConverter.toDto(port.create(visitanteConverter.toEntity(dto)));
    }

    @GetMapping
    public ResponseEntity<VisitanteDto> findByRg(@RequestParam String rg) {
        return ResponseEntity.ok(visitanteConverter.toDto(port.findByRg(rg)));
    }
}
