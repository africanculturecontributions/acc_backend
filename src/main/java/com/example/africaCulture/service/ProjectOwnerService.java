package com.example.africaCulture.service;

import com.example.africaCulture.dto.request.ProjectOwnerRequest;
import com.example.africaCulture.dto.response.ProjectOwnerResponse;

public interface ProjectOwnerService {
    public ProjectOwnerResponse registerProjectOwner(ProjectOwnerRequest projectOwnerRequest);
}
