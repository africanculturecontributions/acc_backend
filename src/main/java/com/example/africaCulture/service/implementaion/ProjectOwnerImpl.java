package com.example.africaCulture.service.implementaion;

import com.example.africaCulture.dto.request.ProjectOwnerRequest;
import com.example.africaCulture.dto.response.ProjectOwnerResponse;
import com.example.africaCulture.entity.ProjectOwner;
import com.example.africaCulture.repository.ProjectOwnerRepository;
import com.example.africaCulture.service.ProjectOwnerService;
import org.springframework.stereotype.Service;

@Service
public class ProjectOwnerImpl implements ProjectOwnerService {
    private final ProjectOwnerRepository projectOwnerRepository;

    public ProjectOwnerImpl(ProjectOwnerRepository projectOwnerRepository) {
        this.projectOwnerRepository = projectOwnerRepository;
    }

    @Override
    public ProjectOwnerResponse registerProjectOwner(ProjectOwnerRequest projectOwnerRequest) {
        ProjectOwner projectOwner = new ProjectOwner();
        projectOwner.setFullName(projectOwnerRequest.getFullName());
        projectOwner.setPhoneNumber(projectOwnerRequest.getPhoneNumber());
        projectOwner.setEmail(projectOwnerRequest.getEmail());
        projectOwner.setOrganization(projectOwner.getOrganization());
        projectOwner.setPassword(projectOwner.getPassword());
        projectOwner.setConfirmPassword(projectOwnerRequest.getConfirmPassword());
        ProjectOwner newProjectOwner =  projectOwnerRepository.save(projectOwner);
        return new ProjectOwnerResponse("Project Owner Register successfully " + newProjectOwner);
    }


}
