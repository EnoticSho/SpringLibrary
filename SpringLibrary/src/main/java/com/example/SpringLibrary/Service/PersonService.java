package com.example.SpringLibrary.Service;

import com.example.SpringLibrary.entity.Person;

import java.util.List;

public interface PersonService {
    public List<Person> getPersons();

    public void save(Person person);

    public void findById(int id);
}
