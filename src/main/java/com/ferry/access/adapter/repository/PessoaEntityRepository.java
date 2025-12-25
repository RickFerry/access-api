package com.ferry.access.adapter.repository;

import com.ferry.access.adapter.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaEntityRepository extends JpaRepository<PessoaEntity, Long> {
}