package com.simplyinvest.docker.dockerspringboot.resource.database.controllers;


import com.simplyinvest.docker.dockerspringboot.resource.database.Services.PersonService;
import com.simplyinvest.docker.dockerspringboot.resource.database.entities.Person;
import com.simplyinvest.docker.dockerspringboot.resource.database.entities.dto.PersonDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Person> save(@RequestBody PersonDTO dto){

        Person person = Person.builder().
                name(dto.getName()).
                email(dto.getEmail()).
                build();

        Person persistedPerson = service.save(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(persistedPerson);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> findBy(@PathVariable Long id){

        Optional<Person> personOpt = service.findById(id);

//        if(personOpt.isPresent()){
//            return ResponseEntity.ok(personOpt.get());
//        }
        return personOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.ok(null));
    }

    @GetMapping
    public ResponseEntity<List<Person>> findAll(){

        return ResponseEntity.ok(service.findAll());
    }

/*
{
    "name": "Iron Man",
    "email": "ironman@marvel.com"
}
{
    "name": "Spider Man",
    "email": "spiderman@marvel.com"
}

docker run -p 5432:5432 -d --name my-app-database --network java-docker-net -e POSTGRESS_PASSWORD=123456 -e POSTGRESS_DB=db-java-docker postgres:13-alpine

docker container run --name my-app
 */


}
