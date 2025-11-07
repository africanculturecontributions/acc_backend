package com.example.africaCulture.service;

import com.example.africaCulture.dto.request.FreelanceAgentRequest;
import com.example.africaCulture.dto.response.FreelanceAgentResponse;

public interface FreelanceAgentService {
    public FreelanceAgentResponse createAgentFreelance(FreelanceAgentRequest freelanceAgentRequest);
}
