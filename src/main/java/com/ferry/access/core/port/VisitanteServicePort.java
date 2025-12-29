package com.ferry.access.core.port;

import com.ferry.access.core.domain.Visitante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VisitanteServicePort {
    Visitante create(Visitante entity);

    Visitante findByRg(String rg);

    Page<Visitante> findAll(Pageable pageable);
}
