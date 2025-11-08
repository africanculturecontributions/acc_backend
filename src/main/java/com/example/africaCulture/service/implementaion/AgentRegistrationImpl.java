package com.example.africaCulture.service.implementaion;

import com.example.africaCulture.dto.request.AgentRegistrationRequest;
import com.example.africaCulture.dto.response.AgentRegistrationResponse;
import com.example.africaCulture.dto.response.CooperateAgentResponse;
import com.example.africaCulture.entity.AgentRegistration;
import com.example.africaCulture.entity.CoperateAgent;
import com.example.africaCulture.repository.AgentRegistrationRepository;
import com.example.africaCulture.service.AgentRegistrationService;
import org.springframework.stereotype.Service;

@Service
public class AgentRegistrationImpl implements AgentRegistrationService {
    private final AgentRegistrationRepository agentRegistrationRepository;

    public AgentRegistrationImpl(AgentRegistrationRepository agentRegistrationRepository) {
        this.agentRegistrationRepository = agentRegistrationRepository;
    }

    @Override
    public AgentRegistrationResponse createAgent(AgentRegistrationRequest agentRegistrationRequest) {
        AgentRegistration  agentRegistration = new AgentRegistration();
        agentRegistration.setFullName(agentRegistrationRequest.getFullName());
        agentRegistration.setPhoneNumber(agentRegistrationRequest.getPhoneNumber());
        agentRegistration.setEmail(agentRegistrationRequest.getEmail());
        agentRegistration.setHomeAddress(agentRegistrationRequest.getHomeAddress());
        agentRegistration.setOfficeAddress(agentRegistrationRequest.getOfficeAddress());
        agentRegistration.setCAC(agentRegistrationRequest.getCAC());
        agentRegistration.setNin(agentRegistrationRequest.getNin());
        agentRegistrationRepository.save(agentRegistration);
        return new AgentRegistrationResponse("Agent agent save succesfully");
    }
}
