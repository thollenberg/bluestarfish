package com.valueblue.api.launcher;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class LaunchController {
    @GetMapping("/launch/{id}")
    public ResponseEntity<String> launch(@PathVariable UUID id) {
        // Do something with the ID parameter
        return ResponseEntity.ok("Launched with ID: " + id.toString());
    }

}
