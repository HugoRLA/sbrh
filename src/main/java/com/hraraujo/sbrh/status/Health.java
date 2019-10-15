package com.hraraujo.sbrh.status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class Health {

    @GetMapping("/health/alive")
    public String alive(){

        return "Server is alive. Local time " + LocalDateTime.now();

    }

}
