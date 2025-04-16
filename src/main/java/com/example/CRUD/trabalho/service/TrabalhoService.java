package com.example.CRUD.trabalho.service;

import com.example.CRUD.trabalho.dto.TrabalhoCreateDTO;
import com.example.CRUD.trabalho.dto.TrabalhoDTO;
import com.example.CRUD.trabalho.model.Trabalho;
import com.example.CRUD.trabalho.repository.TrabalhoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrabalhoService {
    @Autowired
    TrabalhoRepository trabalhoRepository;
    @Autowired
    ModelMapper modelMapper;

    public TrabalhoCreateDTO create(TrabalhoCreateDTO trabalho) {
        Trabalho novoTrabalho = modelMapper.map(trabalho, Trabalho.class);
        novoTrabalho = this.trabalhoRepository.save(novoTrabalho);
        return modelMapper.map(novoTrabalho, TrabalhoCreateDTO.class);
    }

    public List<TrabalhoDTO> findAll() {
        List<Trabalho> trabalhos = this.trabalhoRepository.findAll();
        return trabalhos.stream()
                .map(trabalho -> modelMapper.map(trabalho, TrabalhoDTO.class))
                .collect(Collectors.toList());
    }

    public Trabalho findTrabalho(long id) {
        Trabalho trabalho = this.trabalhoRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("erro ao encontrar um trabalho"));
        return trabalho;
    }

    public TrabalhoCreateDTO update(long id, TrabalhoCreateDTO trabalho) {
        Trabalho encontrarTrabalho = findTrabalho(id);
        if (encontrarTrabalho == null) {
            return null;
        }
        modelMapper.map(trabalho, encontrarTrabalho);
        encontrarTrabalho = trabalhoRepository.save(encontrarTrabalho);
        return modelMapper.map(encontrarTrabalho, TrabalhoCreateDTO.class);
    }

    public TrabalhoCreateDTO delete(long id) {
        Trabalho encontrarTrabalho = findTrabalho(id);
        trabalhoRepository.deleteById(id);
        return modelMapper.map(encontrarTrabalho, TrabalhoCreateDTO.class);

    }
}
