package com.example.africaCulture.service;

import com.example.africaCulture.dto.request.CooperateAgentRequest;
import com.example.africaCulture.dto.request.FreelanceAgentRequest;
import com.example.africaCulture.dto.response.CooperateAgentResponse;
import com.example.africaCulture.dto.response.FreelanceAgentResponse;

public interface CooperateAgentService {
    public CooperateAgentResponse createCooperateAgent(CooperateAgentRequest cooperateAgentRequest);
}
