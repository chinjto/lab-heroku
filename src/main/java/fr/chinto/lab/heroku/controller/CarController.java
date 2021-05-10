package fr.chinto.lab.heroku.controller;

import fr.chinto.lab.heroku.entity.Car;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {

    @NonNull
    CrudRepository<Car, Long> repository;

    @GetMapping
    public Iterable<Car> list(){
        return repository.findAll();
    }

    @PostMapping
    public void add(@RequestBody Car item) {
        repository.save(item);
    }

    @PutMapping
    public void update(@RequestBody Car item) {
        repository.save(item);
    }

    @DeleteMapping
    public void delete(@RequestBody Car item) {
        repository.delete(item);
    }

}
