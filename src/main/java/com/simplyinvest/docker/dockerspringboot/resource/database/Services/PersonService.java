package com.simplyinvest.docker.dockerspringboot.resource.database.Services;

import com.simplyinvest.docker.dockerspringboot.resource.database.entities.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Person save(Person person);

    Optional<Person> findById(Long id);

    List<Person> findAll();


}
