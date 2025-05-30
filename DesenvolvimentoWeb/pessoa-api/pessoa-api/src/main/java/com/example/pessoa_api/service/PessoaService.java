package com.example.pessoa_api.service;

import com.example.pessoa_api.entity.Pessoa;
import com.example.pessoa_api.repository.PessoaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa registerPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Optional<Pessoa> getPessoaByCpf(String cpf) {
        return pessoaRepository.findByCpf(cpf);
    }

    public List<Pessoa> getAllPessoas() {
        return pessoaRepository.findAll();
    }
}