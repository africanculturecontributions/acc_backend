package com.example.africaCulture.controller;

import com.example.africaCulture.dto.request.FreelanceAgentRequest;
import com.example.africaCulture.dto.request.GenerousGiverRequest;
import com.example.africaCulture.dto.response.FreelanceAgentResponse;
import com.example.africaCulture.dto.response.GenerousGiverResponse;
import com.example.africaCulture.service.FreelanceAgentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FreelanceAgentController {

    private final FreelanceAgentService freelanceAgentService;

    public FreelanceAgentController(FreelanceAgentService freelanceAgentService) {
        this.freelanceAgentService = freelanceAgentService;
    }



    @PostMapping("/register-freelance-agent")
    public FreelanceAgentResponse registerGenerous(@RequestBody FreelanceAgentRequest freelanceAgentRequest){
        return   freelanceAgentService.createAgentFreelance(freelanceAgentRequest);
    }
}
