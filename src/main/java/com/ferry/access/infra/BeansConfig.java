package com.ferry.access.infra;

import com.ferry.access.core.port.UsuarioServicePort;
import com.ferry.access.core.service.UsuarioServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    UsuarioServicePort usuarioServicePort() {
        return new UsuarioServiceImpl();
    }
}
