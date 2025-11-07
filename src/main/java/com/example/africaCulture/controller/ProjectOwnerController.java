package com.example.africaCulture.controller;

import com.example.africaCulture.dto.request.GenerousGiverRequest;
import com.example.africaCulture.dto.request.ProjectOwnerRequest;
import com.example.africaCulture.dto.response.GenerousGiverResponse;
import com.example.africaCulture.dto.response.ProjectOwnerResponse;
import com.example.africaCulture.service.ProjectOwnerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectOwnerController {
    private final ProjectOwnerService projectOwnerService;

    public ProjectOwnerController(ProjectOwnerService projectOwnerService) {
        this.projectOwnerService = projectOwnerService;
    }
    @PostMapping("/register-project-owner")
    public ProjectOwnerResponse registerProjectOwner(@RequestBody ProjectOwnerRequest projectOwnerRequest){
        return  projectOwnerService.registerProjectOwner(projectOwnerRequest);

    }



}
