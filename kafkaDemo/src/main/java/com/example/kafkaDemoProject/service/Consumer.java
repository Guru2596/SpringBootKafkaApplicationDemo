package com.example.kafkaDemoProject.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics="Vaccination_Slot_Information", groupId="slotInfoGroup")
    public void listenToTopic(String message){
        System.out.println("The Message Received is" + message);
    }
}
