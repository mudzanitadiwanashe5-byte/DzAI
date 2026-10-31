package com.dzai.web;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping("/api/status")
    public Map<String, String> status() {
        return Map.of(
            "application", "DZ AI",
            "status", "running",
            "message", "Your DZ AI starter application is working."
        );
    }
}
