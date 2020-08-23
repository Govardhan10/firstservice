package com.centime.firstservice.service;

import com.centime.firstservice.client.FullNameClient;
import com.centime.firstservice.client.HelloClient;
import com.centime.firstservice.model.NameDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GreetingService {

    @Autowired
    HelloClient helloClient;

    @Autowired
    FullNameClient fullNameClient;

    public ResponseEntity<String> getGreeting(NameDetails details) {
        log.info("Name details payload : {}",details.toString());
        String hello = helloClient.getHello().getBody();
        String name = fullNameClient.getFullName(details).getBody();
        String fullName = hello + " " + name;
        return ResponseEntity.ok().body(fullName);
    }

}
