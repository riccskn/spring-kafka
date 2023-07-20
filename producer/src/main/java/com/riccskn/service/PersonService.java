package com.riccskn.service;


import com.riccskn.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private KafkaTemplate<String, Person> kafkaTemplate;

    public void sendPerson(Person person) {
        kafkaTemplate.send("topic-1", person);
    }

}
