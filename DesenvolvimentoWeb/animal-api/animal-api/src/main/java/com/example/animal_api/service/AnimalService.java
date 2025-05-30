package com.example.animal_api.service;

import com.example.animal_api.entity.Animal;
import com.example.animal_api.repository.AnimalRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnimalService {
    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Animal registerAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public List<Animal> getAnimalsByTutor(String tutorId) {
        return animalRepository.findByTutorId(tutorId);
    }

    // 🔹 Método para listar TODOS os animais cadastrados
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }
}