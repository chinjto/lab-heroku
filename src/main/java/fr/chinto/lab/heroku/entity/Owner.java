package fr.chinto.lab.heroku.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Owner extends GenericEntity {

    private String firstName;

    private String lastName;

    @OneToMany
    private List<Car> carList;

}
