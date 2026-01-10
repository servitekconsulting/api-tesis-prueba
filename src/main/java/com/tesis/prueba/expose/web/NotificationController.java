package com.tesis.prueba.expose.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/notification", produces = MediaType.APPLICATION_JSON_VALUE)
public class NotificationController {

    private static final String GREETING = "Hello, World!";

    @GetMapping("/email")
    public String notificationEmail() {
        return GREETING;
    }
}
