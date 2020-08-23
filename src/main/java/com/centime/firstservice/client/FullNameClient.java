package com.centime.firstservice.client;

import com.centime.firstservice.model.NameDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("third-service")
public interface FullNameClient {

    @PostMapping("/fullname")
    public ResponseEntity<String> getFullName(NameDetails details);

}
