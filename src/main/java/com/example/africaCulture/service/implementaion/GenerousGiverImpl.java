package com.example.africaCulture.service.implementaion;

import com.example.africaCulture.dto.request.GenerousGiverRequest;
import com.example.africaCulture.dto.response.GenerousGiverResponse;
import com.example.africaCulture.entity.GenerousGiver;
import com.example.africaCulture.repository.GenerousGiverRepository;
import com.example.africaCulture.service.GenerousGiverService;
import org.springframework.stereotype.Service;

@Service
public class GenerousGiverImpl implements GenerousGiverService {
    private final GenerousGiverRepository generousGiverRepository;

    public GenerousGiverImpl(GenerousGiverRepository generousGiverRepository) {
        this.generousGiverRepository = generousGiverRepository;
    }

    @Override
    public GenerousGiverResponse registerGenerousGiver(GenerousGiverRequest generousGiverRequest) {
        GenerousGiver generousGiver = new GenerousGiver();
        generousGiver.setPassWord(generousGiverRequest.getPassWord());
        generousGiver.setPhoneNumber(generousGiverRequest.getPhoneNumber());
        generousGiver.setEmailAddress(generousGiverRequest.getEmailAddress());
        GenerousGiver newGenerousGiver =   generousGiverRepository.save(generousGiver);
        return  new GenerousGiverResponse("successfuly register " + newGenerousGiver);
    }
}
