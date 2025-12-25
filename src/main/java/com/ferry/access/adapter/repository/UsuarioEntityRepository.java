package com.ferry.access.adapter.repository;

import com.ferry.access.adapter.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioEntityRepository extends JpaRepository<UsuarioEntity, Long> {
}