package com.ferry.access.core.service;

import com.ferry.access.core.domain.Visitante;
import com.ferry.access.core.port.VisitanteEntityRepositoryPort;
import com.ferry.access.core.port.VisitanteServicePort;

public class VisitanteServicePortImpl implements VisitanteServicePort {
    private final VisitanteEntityRepositoryPort port;

    public VisitanteServicePortImpl(VisitanteEntityRepositoryPort port) {
        this.port = port;
    }

    @Override
    public Visitante create(Visitante entity) {
        return port.create(entity);
    }
}
