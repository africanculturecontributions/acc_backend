package com.example.africaCulture.dto.response;

public class ProjectOwnerResponse {
    private String message;

    public ProjectOwnerResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
