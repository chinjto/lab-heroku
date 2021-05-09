package fr.chinto.lab.heroku.repository;

import fr.chinto.lab.heroku.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Long, Car> { }
