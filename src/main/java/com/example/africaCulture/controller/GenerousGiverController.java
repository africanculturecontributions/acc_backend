package com.example.africaCulture.controller;

import com.example.africaCulture.dto.request.GenerousGiverRequest;
import com.example.africaCulture.dto.response.GenerousGiverResponse;
import com.example.africaCulture.service.GenerousGiverService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerousGiverController {
    private final GenerousGiverService generousGiverService;

    public GenerousGiverController(GenerousGiverService generousGiverService) {
        this.generousGiverService = generousGiverService;
    }
    @PostMapping("/register-generous")
    public GenerousGiverResponse registerGenerous(@RequestBody GenerousGiverRequest generousGiverRequest){
      return   generousGiverService.registerGenerousGiver(generousGiverRequest);
    }
}
