package com.example.SpringLibrary.Controllers;

import com.example.SpringLibrary.Service.PersonService;
import com.example.SpringLibrary.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/people")
    public String getAllPersons(Model model) {
        List<Person> persons = personService.getPersons();
        model.addAttribute("allPersons", persons);
        return "getPeople";
    }

    @RequestMapping("/people/new")
    public String addNewPerson(Model model) {
        model.addAttribute("newPerson", new Person());
        return "form_for_new_person";
    }

    @PostMapping("/people")
    public String updatePersons(@ModelAttribute("newPerson") Person person) {
        personService.save(person);
        return "redirect:/people";
    }

    @GetMapping("/people/{id}")
    public String showPersonInfo(@PathVariable int id, Model model) {
        model.addAttribute("personInfo",personService.findById(id));
        return "personInfo";
    }

    @DeleteMapping("/people/{id}")
    public String deletePerson(@PathVariable int id) {
        personService.deleteById(id);
        return "redirect:/people";
    }

    @GetMapping("/people/{id}/edit")
    public String editPersonInfo(@PathVariable int id, Model model) {
        model.addAttribute("newPerson", personService.findById(id));
        return "editPerson";
    }

    @PutMapping("/people")
    public String savePerson(@ModelAttribute("newPerson") Person person) {
        personService.save(person);
        return "redirect:/people";
    }
}
