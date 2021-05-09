package fr.chinto.lab.heroku.controller;

import fr.chinto.lab.heroku.entity.Car;
import fr.chinto.lab.heroku.entity.Owner;
import lombok.NonNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.*;

@RestController("/owners")
public class OwnerController {

    @NonNull
    CrudRepository<Owner, Long> repository;

    @GetMapping
    public Iterable<Owner> list(){
        return repository.findAll();
    }

    @PostMapping
    public void add(@RequestBody Owner item) {
        repository.save(item);
    }

    @PutMapping
    public void update(@RequestBody Owner item) {
        repository.save(item);
    }

    @DeleteMapping
    public void delete(@RequestBody Owner item) {
        repository.delete(item);
    }

}
