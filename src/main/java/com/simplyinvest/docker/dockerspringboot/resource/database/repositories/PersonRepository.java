package com.simplyinvest.docker.dockerspringboot.resource.database.repositories;

import com.simplyinvest.docker.dockerspringboot.resource.database.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
