package com.example.sds;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/** Entry point for the "Kafka" demo. Replace with the real implementation (see TODO.md). */
@RestController
public class KafkaController {
    @GetMapping("/demo/kafka")
    public Map<String, String> demo() {
        return Map.of("concept", "Kafka", "status", "scaffold - implement me");
    }
}
