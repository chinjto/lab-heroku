package fr.chinto.lab.heroku.controller;

import fr.chinto.lab.heroku.entity.Owner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owners")
public class OwnerController extends GenericController<Owner> { }
