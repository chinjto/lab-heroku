package fr.chinto.lab.heroku.repository;

import fr.chinto.lab.heroku.entity.GenericEntity;
import org.springframework.data.repository.CrudRepository;

public interface GenericRepository<E extends GenericEntity> extends CrudRepository<E, Long> { }
