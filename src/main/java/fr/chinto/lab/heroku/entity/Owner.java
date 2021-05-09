package fr.chinto.lab.heroku.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Owner {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    @OneToMany
    private List<Car> carList;

}
