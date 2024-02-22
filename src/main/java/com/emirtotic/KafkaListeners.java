package com.emirtotic;

import org.apache.kafka.common.protocol.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "emirtotic",
            groupId = "exampleId",
            containerFactory = "factory"
    )
    void listener(Message data) {
        System.out.println("Listener recieved: " + data + " :)");
    }

}
