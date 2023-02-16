package com.cutecat.security.dummy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/dummy")
public class DummyController {

    @GetMapping
    public ResponseEntity<String> dummy(){
        return ResponseEntity.ok("Dummy test");
    }
}
