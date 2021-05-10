package fr.chinto.lab.heroku.controller;

import fr.chinto.lab.heroku.entity.Car;
import fr.chinto.lab.heroku.repository.GenericRepository;
import lombok.NonNull;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController extends GenericController<Car> { }
