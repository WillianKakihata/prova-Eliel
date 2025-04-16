package com.example.CRUD.pessoa.dto;

import com.example.CRUD.trabalho.model.Trabalho;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {
    private String cpf;
    private int idade;
}
