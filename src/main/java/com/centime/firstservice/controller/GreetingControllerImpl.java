package com.centime.firstservice.controller;

import com.centime.firstservice.model.NameDetails;
import com.centime.firstservice.service.GreetingService;
import com.netflix.discovery.EurekaClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GreetingControllerImpl implements GreetingController{

    @Autowired
    GreetingService service;

    @Qualifier("eurekaClient")
    @Lazy
    @Autowired
    EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Override
    public ResponseEntity<String> getGreeting(NameDetails details) {
        log.info("Service name : {} , endpoint : /greeting ",eurekaClient.getApplication(appName).getName());
        return service.getGreeting(details);
    }
}
