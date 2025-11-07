package com.example.africaCulture.service.implementaion;

import com.example.africaCulture.dto.request.FreelanceAgentRequest;
import com.example.africaCulture.dto.response.FreelanceAgentResponse;
import com.example.africaCulture.entity.FreelanceAgent;
import com.example.africaCulture.repository.FreelanceAgentRepository;
import com.example.africaCulture.service.FreelanceAgentService;
import org.springframework.stereotype.Service;

@Service
public class FreelaanceAgentImplement implements FreelanceAgentService {
    private final FreelanceAgentRepository freelanceAgentRepository;

    public FreelaanceAgentImplement(FreelanceAgentRepository freelanceAgentRepository) {
        this.freelanceAgentRepository = freelanceAgentRepository;
    }

    @Override
    public FreelanceAgentResponse createAgentFreelance(FreelanceAgentRequest freelanceAgentRequest) {
        FreelanceAgent freelanceAgent = new FreelanceAgent();
        freelanceAgent.setFullName(freelanceAgentRequest.getFullName());
        freelanceAgent.setPhoneNumber(freelanceAgentRequest.getPhoneNumber());
        freelanceAgent.setEmail(freelanceAgentRequest.getEmail());
        freelanceAgent.setAddress(freelanceAgentRequest.getAddress());
        freelanceAgent.setNin(freelanceAgentRequest.getNin());
        FreelanceAgent newFreelance =  freelanceAgentRepository.save(freelanceAgent);

        return new FreelanceAgentResponse("save successfully");
    }
}
