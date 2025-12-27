package com.ferry.access.adapter.repository;

import com.ferry.access.adapter.entity.PessoaEntity;
import com.ferry.access.adapter.entity.UsuarioEntity;
import com.ferry.access.core.domain.Usuario;
import com.ferry.access.core.port.UsuarioEntityRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class UsuarioEntityRespositoryAdapter implements UsuarioEntityRepositoryPort {
    private final UsuarioEntityRepository usuarioEntityRepository;
    private final PessoaEntityRepository pessoaEntityRepository;
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public Usuario create(Usuario usuario) {
        PessoaEntity pessoaMap = modelMapper.map(usuario.getPessoa(), PessoaEntity.class);
        PessoaEntity pessoaSave = pessoaEntityRepository.save(pessoaMap);
        UsuarioEntity usuarioMap = modelMapper.map(usuario, UsuarioEntity.class);
        usuarioMap.setPessoa(pessoaSave);

        return modelMapper.map(usuarioEntityRepository.save(usuarioMap), Usuario.class);
    }
}
