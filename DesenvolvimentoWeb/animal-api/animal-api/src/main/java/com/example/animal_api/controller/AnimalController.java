package com.example.animal_api.controller;

import com.example.animal_api.entity.Animal;
import com.example.animal_api.service.AnimalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @PostMapping("/register")
    public ResponseEntity<Animal> register(@RequestBody Animal animal) {
        Animal savedAnimal = animalService.registerAnimal(animal);
        return ResponseEntity.ok(savedAnimal);
    }

    @GetMapping
    public ResponseEntity<List<Animal>> getAllAnimals() {
        List<Animal> animals = animalService.getAllAnimals();
        return ResponseEntity.ok(animals);
    }

    @GetMapping("/byTutor/{tutorId}")
    public ResponseEntity<List<Animal>> getByTutor(@PathVariable String tutorId) {
        List<Animal> animals = animalService.getAnimalsByTutor(tutorId);
        return ResponseEntity.ok(animals);
    }
}
