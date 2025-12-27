package com.ferry.access.core.service;

import com.ferry.access.core.domain.Morador;
import com.ferry.access.core.port.MoradorEntityRepositoryPort;
import com.ferry.access.core.port.MoradorServicePort;

public class MoradorServicePortImpl implements MoradorServicePort {
    private final MoradorEntityRepositoryPort port;

    public MoradorServicePortImpl(MoradorEntityRepositoryPort port) {
        this.port = port;
    }

    @Override
    public Morador create(Morador morador) {
        return port.create(morador);
    }
}
