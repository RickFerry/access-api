package com.ferry.access.adapter.repository;

import com.ferry.access.adapter.entity.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VisitanteEntityRepository extends JpaRepository<VisitanteEntity, Long> {
    Optional<VisitanteEntity> findByRg(String rg);
}