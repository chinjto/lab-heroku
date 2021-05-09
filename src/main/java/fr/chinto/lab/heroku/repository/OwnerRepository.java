package fr.chinto.lab.heroku.repository;

import fr.chinto.lab.heroku.entity.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Long, Owner> { }
