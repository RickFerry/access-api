package com.ferry.access.infra;

import com.ferry.access.core.port.*;
import com.ferry.access.core.service.MoradorServicePortImpl;
import com.ferry.access.core.service.PessoaServicePortImpl;
import com.ferry.access.core.service.UsuarioServicePortImpl;
import com.ferry.access.core.service.VisitanteServicePortImpl;
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
    VisitanteServicePort visitanteServicePort(VisitanteEntityRepositoryPort visitanteEntityRepositoryPort) {
        return new VisitanteServicePortImpl(visitanteEntityRepositoryPort);
    }

    @Bean
    PessoaServicePort pessoaServicePort(PessoaEntityRepositoryPort pessoaEntityRepositoryPort) {
        return new PessoaServicePortImpl(pessoaEntityRepositoryPort);
    }

    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
