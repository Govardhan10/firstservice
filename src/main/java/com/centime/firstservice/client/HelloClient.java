package com.centime.firstservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("second-service")
public interface HelloClient {

    @GetMapping("/greeting")
    public ResponseEntity<String> getHello();

}
