package com.example.animal_api.repository;

import com.example.animal_api.entity.Animal;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface AnimalRepository extends MongoRepository<Animal, String> {
    List<Animal> findByTutorId(String tutorId);
}
