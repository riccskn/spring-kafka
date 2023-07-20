package com.riccskn.service;


import com.riccskn.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        personList.add(person);
    }


}
