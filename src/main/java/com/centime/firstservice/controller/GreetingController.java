package com.centime.firstservice.controller;

import com.centime.firstservice.model.NameDetails;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Api("Greeting Controller")
public interface GreetingController {

    @ApiOperation("Method to get greeting with name")
    @PostMapping(value = "/greeting",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getGreeting(@Valid @RequestBody(required = true) NameDetails details);
}
