package com.example.CRUD.trabalho.repository;

import com.example.CRUD.trabalho.model.Trabalho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {
}
