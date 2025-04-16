package com.example.CRUD.trabalho.dto;

import com.example.CRUD.pessoa.model.Pessoa;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrabalhoDTO {

    private String nome;
    private String endereco;
    private Long pessoaId;
}
