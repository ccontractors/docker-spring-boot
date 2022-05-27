package com.simplyinvest.docker.dockerspringboot.resource.database.Services.impl;

import com.simplyinvest.docker.dockerspringboot.resource.database.Services.PersonService;
import com.simplyinvest.docker.dockerspringboot.resource.database.entities.Person;
import com.simplyinvest.docker.dockerspringboot.resource.database.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repository;

    public PersonServiceImpl(PersonRepository repository) {
        this.repository= repository;
    }

    @Override
    public Person save(Person person) {
        return repository.save(person);
    }

    @Override
    public Optional<Person> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Person> findAll() {
        return repository.findAll();
    }
}
