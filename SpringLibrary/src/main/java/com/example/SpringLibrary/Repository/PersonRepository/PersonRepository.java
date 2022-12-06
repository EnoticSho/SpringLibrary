package com.example.SpringLibrary.Repository.PersonRepository;

import com.example.SpringLibrary.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
