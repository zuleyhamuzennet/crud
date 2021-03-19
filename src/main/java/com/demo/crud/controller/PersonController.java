package com.demo.crud.controller;

import com.demo.crud.entity.Persons;
import com.demo.crud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping
    public List<Persons> listAllPersons(){
        return personService.listAllPersons();
    }
}
