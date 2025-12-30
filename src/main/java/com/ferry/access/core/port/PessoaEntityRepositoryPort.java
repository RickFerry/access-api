package com.ferry.access.core.port;

import com.ferry.access.core.domain.Pessoa;

public interface PessoaEntityRepositoryPort {
    Pessoa create(Pessoa pessoa);
}
