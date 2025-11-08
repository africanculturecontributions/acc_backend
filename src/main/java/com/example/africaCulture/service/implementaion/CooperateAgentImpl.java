package com.example.africaCulture.service.implementaion;

import com.example.africaCulture.dto.request.CooperateAgentRequest;
import com.example.africaCulture.dto.response.CooperateAgentResponse;
import com.example.africaCulture.entity.CoperateAgent;
import com.example.africaCulture.repository.CooperateAgentRepository;
import com.example.africaCulture.service.CooperateAgentService;
import org.springframework.stereotype.Service;

@Service
public class CooperateAgentImpl implements CooperateAgentService {
    private final CooperateAgentRepository cooperateAgentRepository;

    public CooperateAgentImpl(CooperateAgentRepository cooperateAgentRepository) {
        this.cooperateAgentRepository = cooperateAgentRepository;
    }

    @Override
    public CooperateAgentResponse createCooperateAgent(CooperateAgentRequest cooperateAgentRequest) {
        CoperateAgent coperateAgent = new CoperateAgent();
        coperateAgent.setFullName(cooperateAgentRequest.getFullName());
        coperateAgent.setPhoneNumber(cooperateAgentRequest.getPhoneNumber());
        coperateAgent.setEmail(cooperateAgentRequest.getEmail());
        coperateAgent.setHomeAddress(cooperateAgentRequest.getHomeAddress());
        coperateAgent.setOfficeAddress(cooperateAgentRequest.getOfficeAddress());
        coperateAgent.setCAC(cooperateAgentRequest.getCAC());
        coperateAgent.setNin(cooperateAgentRequest.getNin());
        cooperateAgentRepository.save(coperateAgent);
        return new CooperateAgentResponse("Cooperate agent save succesfully");
    }
}

