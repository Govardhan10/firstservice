package com.centime.firstservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("Service Status Controller")
public interface ServiceStatusController {

    @ApiOperation("Endpoint to retieve service status")
    @GetMapping(value = "/status",produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> getStatus();
}
