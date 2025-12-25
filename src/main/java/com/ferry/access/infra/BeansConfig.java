package com.ferry.access.infra;

import com.ferry.access.core.port.UsuarioEntityRepositoryPort;
import com.ferry.access.core.port.UsuarioServicePort;
import com.ferry.access.core.service.UsuarioServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    UsuarioServicePort usuarioServicePort(UsuarioEntityRepositoryPort usuarioEntityRepositoryPort) {
        return new UsuarioServiceImpl(usuarioEntityRepositoryPort);
    }

    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
