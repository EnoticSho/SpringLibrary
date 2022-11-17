package com.example.SpringLibrary.DAO.PersonDAO;

import com.example.SpringLibrary.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDAO extends JpaRepository<Person, Integer> {
}
