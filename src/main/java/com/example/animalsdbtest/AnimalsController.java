package com.example.animalsdbtest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
@RequiredArgsConstructor
public class AnimalsController {
    private final AnimalsService animalsService;

    @PostMapping
    public Animal create(@RequestBody Animal animal) {
        return animalsService.create(animal);
    }

    @GetMapping
    public List<Animal> getAll() {
        return animalsService.getAll();
    }

    @PutMapping("/{id}")
    public Animal update(@PathVariable String id, @RequestBody Animal animal) {
        animal.setId(id);
        return animalsService.update(animal);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        animalsService.delete(id);
    }


}
