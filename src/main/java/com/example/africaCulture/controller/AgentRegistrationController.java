package com.example.africaCulture.controller;

import com.example.africaCulture.dto.request.AgentRegistrationRequest;
import com.example.africaCulture.dto.request.CooperateAgentRequest;
import com.example.africaCulture.dto.response.AgentRegistrationResponse;
import com.example.africaCulture.dto.response.CooperateAgentResponse;
import com.example.africaCulture.service.AgentRegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgentRegistrationController {
    private final AgentRegistrationService agentRegistrationService;

    public AgentRegistrationController(AgentRegistrationService agentRegistrationService) {
        this.agentRegistrationService = agentRegistrationService;
    }


    @PostMapping("/register-agent")
    public AgentRegistrationResponse registerAgent(@RequestBody AgentRegistrationRequest agentRegistrationRequest){
        return   agentRegistrationService.createAgent(agentRegistrationRequest);
    }
}
