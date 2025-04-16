package com.example.CRUD.pessoa.model;

import com.example.CRUD.trabalho.model.Trabalho;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "IDADE")
    private int idade;

}
