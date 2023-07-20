package com.riccskn.listener;


import com.riccskn.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "topic-1", group = "")
    public void listener(Person person) {

    }

}
