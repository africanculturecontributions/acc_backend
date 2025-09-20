package com.example.africaCulture.service;

import com.example.africaCulture.dto.request.GenerousGiverRequest;
import com.example.africaCulture.dto.response.GenerousGiverResponse;

public interface GenerousGiverService {
    public GenerousGiverResponse registerGenerousGiver(GenerousGiverRequest generousGiverRequest);
}
