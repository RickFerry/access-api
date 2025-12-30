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
        PessoaEntity pessoaSaved = pessoaEntityRepository.findById(
                usuario.getPessoa().getId()).orElseThrow(() -> new RuntimeException("Pessoa not found"));
        UsuarioEntity usuarioMap = modelMapper.map(usuario, UsuarioEntity.class);
        usuarioMap.setPessoa(pessoaSaved);

        return modelMapper.map(usuarioEntityRepository.save(usuarioMap), Usuario.class);
    }
}
