package fr.chinto.lab.heroku.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Car extends GenericEntity {

    private String registryNumber;

    @ManyToOne
    private Owner owner;

}
