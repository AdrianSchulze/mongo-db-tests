package com.example.animalsdbtest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalsService {

    private final AnimalsRepository animalsRepository;

    public Animal create(Animal animal) {
        return animalsRepository.save(animal);
    }

    public List<Animal> getAll() {
        return animalsRepository.findAll();
    }

    public Animal update(Animal animal) {
        return animalsRepository.save(animal);
    }

    public void delete(String id) {
        animalsRepository.deleteById(id);
    }
}
