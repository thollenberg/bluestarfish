package com.valueblue.api.launcher;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

@RestController
public class LaunchController {
    @PostMapping("/launch/{configId}")
    public ResponseEntity<LaunchResponse> launch(@PathVariable String configId) throws HttpClientErrorException {
        UUID id;
        LaunchResponse launchResponse = new LaunchResponse();
        try {
           id = UUID.fromString(configId);
           launchResponse.setConfigId(id);
           launchResponse.setQueueId(UUID.randomUUID());
        } catch (Error error) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(launchResponse);
    }

}
