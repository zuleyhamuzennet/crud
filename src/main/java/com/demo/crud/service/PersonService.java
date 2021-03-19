package com.demo.crud.service;

import com.demo.crud.entity.Persons;
import com.demo.crud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public List<Persons> listAllPersons(){
        List<Persons> personsList=personRepository.findAll();
        return personsList;
    }
}
