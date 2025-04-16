package com.example.CRUD.pessoa.service;

import com.example.CRUD.pessoa.dto.PessoaDTO;
import com.example.CRUD.pessoa.model.Pessoa;
import com.example.CRUD.pessoa.repository.PessoaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.ErrorResponseException;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    PessoaRepository pessoaRepository;
    @Autowired
    ModelMapper modelMapper;

    public PessoaDTO create(PessoaDTO pessoa) {
        Pessoa novaPessoa = modelMapper.map(pessoa, Pessoa.class);
        novaPessoa = this.pessoaRepository.save(novaPessoa);
        return modelMapper.map(novaPessoa, PessoaDTO.class);
    }

    public List<PessoaDTO> findAll() {
        List<Pessoa> pessoas = this.pessoaRepository.findAll();
        return modelMapper.map(pessoas, new TypeToken<List<PessoaDTO>>(){}.getType());
    }

    public Pessoa findPessoa(long id) {
        Pessoa pessoa = this.pessoaRepository.findById(id).orElseThrow();
        if (pessoa != null) {
            return pessoa;
        }
        return null;
    }

    public Pessoa update(long id, PessoaDTO pessoa) {
        Pessoa encontrarPessoa = this.findPessoa(id);
        if (encontrarPessoa == null) {
            throw new EntityNotFoundException("erro ao encontrar a pessoa");
        }
        modelMapper.map(encontrarPessoa, pessoa);
        return this.pessoaRepository.save(encontrarPessoa);
    }

    public PessoaDTO delete(long id) {
        Pessoa encontrarPessoa = this.findPessoa(id);
        if (encontrarPessoa == null) {
            throw new EntityNotFoundException("erro ao encontrar a pessoa");
        }
        this.pessoaRepository.deleteById(id);
        return modelMapper.map(encontrarPessoa, PessoaDTO.class);

    }
}
