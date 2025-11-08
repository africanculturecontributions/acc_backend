package com.example.africaCulture.service;

import com.example.africaCulture.dto.request.AgentRegistrationRequest;
import com.example.africaCulture.dto.request.CooperateAgentRequest;
import com.example.africaCulture.dto.response.AgentRegistrationResponse;
import com.example.africaCulture.dto.response.CooperateAgentResponse;

public interface AgentRegistrationService {
    public AgentRegistrationResponse createAgent(AgentRegistrationRequest agentRegistrationRequest);
}
