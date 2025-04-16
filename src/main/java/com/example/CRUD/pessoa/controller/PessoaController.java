package com.example.CRUD.pessoa.controller;

import com.example.CRUD.pessoa.dto.PessoaDTO;
import com.example.CRUD.pessoa.model.Pessoa;
import com.example.CRUD.pessoa.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {
    @Autowired
    PessoaService pessoaService;

    @PostMapping(value = "/create")
    public PessoaDTO create(@RequestBody PessoaDTO dto) {
        return this.pessoaService.create(dto);
    }

    @PutMapping(value = "/atualizar/{id}")
    public Pessoa update(@RequestBody PessoaDTO pessoa, @PathVariable Long id ) {
        return this.pessoaService.update(id, pessoa);
    }

    @DeleteMapping(value = "/delete/{id}")
    public PessoaDTO delete(@PathVariable Long id) {
        return this.pessoaService.delete(id);
    }
}
