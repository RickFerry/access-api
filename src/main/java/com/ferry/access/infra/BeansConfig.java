package com.ferry.access.infra;

import com.ferry.access.core.port.MoradorEntityRepositoryPort;
import com.ferry.access.core.port.MoradorServicePort;
import com.ferry.access.core.port.UsuarioEntityRepositoryPort;
import com.ferry.access.core.port.UsuarioServicePort;
import com.ferry.access.core.service.MoradorServicePortImpl;
import com.ferry.access.core.service.UsuarioServicePortImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    UsuarioServicePort usuarioServicePort(UsuarioEntityRepositoryPort usuarioEntityRepositoryPort) {
        return new UsuarioServicePortImpl(usuarioEntityRepositoryPort);
    }

    @Bean
    MoradorServicePort moradorServicePort(MoradorEntityRepositoryPort moradorServicePort) {
        return new MoradorServicePortImpl(moradorServicePort);
    }

    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
