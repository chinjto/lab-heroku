package fr.chinto.lab.heroku.controller;

import fr.chinto.lab.heroku.entity.GenericEntity;
import fr.chinto.lab.heroku.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class GenericController<E extends GenericEntity> {

    @Autowired
    GenericRepository<E> repository;

    @GetMapping
    public Iterable<E> list(){
        return repository.findAll();
    }

    @PostMapping
    public void add(@RequestBody E item) {
        repository.save(item);
    }

    @PutMapping
    public void update(@RequestBody E item) {
        repository.save(item);
    }

    @DeleteMapping
    public void delete(@RequestBody E item) {
        repository.delete(item);
    }
}
