package com.centime.firstservice.controller;

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
public class StatusControllerImpl implements ServiceStatusController {

    @Qualifier("eurekaClient")
    @Lazy
    @Autowired
    EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Override
    public ResponseEntity<String> getStatus() {
        log.info("Service name : {} , endpoint : /status ",eurekaClient.getApplication(appName).getName());
        return ResponseEntity.ok().body("Up");
    }
}
