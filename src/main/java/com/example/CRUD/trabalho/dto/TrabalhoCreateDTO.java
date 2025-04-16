package com.example.CRUD.trabalho.dto;

import com.example.CRUD.pessoa.model.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrabalhoCreateDTO {
    private Long id;
    private String nome;
    private String endereco;
    private Pessoa pessoa;
}
