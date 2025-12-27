package com.ferry.access.adapter.controller;

import com.ferry.access.adapter.converter.MoradorConverter;
import com.ferry.access.adapter.dto.MoradorDto;
import com.ferry.access.core.port.MoradorServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/moradores")
public class MoradorController {
    private final MoradorConverter moradorConverter;
    private final MoradorServicePort port;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MoradorDto create(@RequestBody MoradorDto dto) {
        return moradorConverter.toDto(port.create(moradorConverter.toEntity(dto)));
    }
}
