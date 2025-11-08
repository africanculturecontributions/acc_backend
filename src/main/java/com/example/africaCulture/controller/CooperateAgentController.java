package com.example.africaCulture.controller;

import com.example.africaCulture.dto.request.CooperateAgentRequest;
import com.example.africaCulture.dto.request.FreelanceAgentRequest;
import com.example.africaCulture.dto.response.CooperateAgentResponse;
import com.example.africaCulture.dto.response.FreelanceAgentResponse;
import com.example.africaCulture.service.CooperateAgentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CooperateAgentController {
    private final CooperateAgentService cooperateAgentService;

    public CooperateAgentController(CooperateAgentService cooperateAgentService) {
        this.cooperateAgentService = cooperateAgentService;
    }


    @PostMapping("/register-cooperate-agent")
    public CooperateAgentResponse registerCooperateAgent(@RequestBody CooperateAgentRequest cooperateAgentRequest){
        return   cooperateAgentService.createCooperateAgent(cooperateAgentRequest);
    }
}
