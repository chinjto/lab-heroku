package fr.chinto.lab.heroku.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Car {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String registryNumber;

    @ManyToOne
    private Owner owner;

}
