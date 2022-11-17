package com.example.SpringLibrary.Service;

import com.example.SpringLibrary.DAO.PersonDAO.PersonDAO;
import com.example.SpringLibrary.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;

    @Override
    public List<Person> getPersons() {
        List<Person> all = personDAO.findAll();
        return all;
    }

    @Override
    public void save(Person person) {
        personDAO.save(person);
    }

    @Override
    public Person findById(int id) {
        Optional<Person> byId = personDAO.findById(id);
        byId.ge
    }
}
