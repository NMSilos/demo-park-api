package com.nmsilos.demoparkapi.repository;

import com.nmsilos.demoparkapi.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
