package com.ferry.access.adapter.repository;

import com.ferry.access.adapter.entity.MoradorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoradorEntityRepository extends JpaRepository<MoradorEntity, Long> {
}