package com.ferry.access.core.service;

import com.ferry.access.core.domain.Pessoa;
import com.ferry.access.core.port.PessoaEntityRepositoryPort;
import com.ferry.access.core.port.PessoaServicePort;

public class PessoaServicePortImpl implements PessoaServicePort {
    private final PessoaEntityRepositoryPort port;

    public PessoaServicePortImpl(PessoaEntityRepositoryPort port) {
        this.port = port;
    }

    @Override
    public Pessoa create(Pessoa pessoa) {
        return port.create(pessoa);
    }
}
