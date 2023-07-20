package com.riccskn.controller;


import com.riccskn.model.Person;
import com.riccskn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private PersonService service;

    @PostMapping(value = "/send")
    public ResponseEntity<Void> post(@RequestBody Person person) {
         service.sendPerson(person);

       return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
