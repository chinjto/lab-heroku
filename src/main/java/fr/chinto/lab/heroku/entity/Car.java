package fr.chinto.lab.heroku.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Car {

    @Id
    private Long id;

    private String registryNumber;

    @ManyToOne
    private Owner owner;

}
