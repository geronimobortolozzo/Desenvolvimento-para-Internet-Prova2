package com.example.pessoa_api.controller;

import com.example.pessoa_api.entity.Pessoa;
import com.example.pessoa_api.service.PessoaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping("/register")
    public ResponseEntity<Pessoa> register(@RequestBody Pessoa pessoa) {
        Pessoa savedPessoa = pessoaService.registerPessoa(pessoa);
        return ResponseEntity.ok(savedPessoa);
    }

    @GetMapping("/byCpf/{cpf}")
    public ResponseEntity<Optional<Pessoa>> getByCpf(@PathVariable String cpf) {
        Optional<Pessoa> pessoa = pessoaService.getPessoaByCpf(cpf);
        return ResponseEntity.ok(pessoa);
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> getAllPessoas() {
        List<Pessoa> pessoas = pessoaService.getAllPessoas();
        return ResponseEntity.ok(pessoas);
    }
}