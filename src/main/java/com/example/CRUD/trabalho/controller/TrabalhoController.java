package com.example.CRUD.trabalho.controller;

import com.example.CRUD.trabalho.dto.TrabalhoCreateDTO;
import com.example.CRUD.trabalho.dto.TrabalhoDTO;
import com.example.CRUD.trabalho.service.TrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/trabalho")
public class TrabalhoController {
    @Autowired
    TrabalhoService trabalhoService;

    @PostMapping(value = "/create")
    public TrabalhoCreateDTO create(@RequestBody TrabalhoCreateDTO dto) {
        return this.trabalhoService.create(dto);
    }

    @PutMapping(value = "/atualizar/{id}")
    public TrabalhoCreateDTO update(@RequestBody TrabalhoCreateDTO trabalho, @PathVariable Long id ) {
        return this.trabalhoService.update(id, trabalho);
    }

    @DeleteMapping(value = "/delete/{id}")
    public TrabalhoCreateDTO delete(@PathVariable Long id) {
        return this.trabalhoService.delete(id);
    }

    @GetMapping()
    public List<TrabalhoDTO> findAll() {
        return this.trabalhoService.findAll();
    }
}
