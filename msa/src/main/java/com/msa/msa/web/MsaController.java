package com.msa.msa.web;

import com.msa.msa.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsaController {

    private final KafkaProducerService kafkaProducerService;

    @Autowired
    public MsaController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @GetMapping("/send")
    public ResponseEntity<String> sendData() {
        try {
            kafkaProducerService.sendMessage("my-topic", "Hello from MSA!");
            return ResponseEntity.ok("Message sent to Kafka");
        } catch (Exception e) {
            // Handle any exception that might occur while sending the message
            return ResponseEntity.status(500).body("Failed to send message to Kafka: " + e.getMessage());
        }
    }
}
