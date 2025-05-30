package com.example.pessoa_api.repository;

import com.example.pessoa_api.entity.Pessoa;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface PessoaRepository extends MongoRepository<Pessoa, String> {
    Optional<Pessoa> findByCpf(String cpf);
}