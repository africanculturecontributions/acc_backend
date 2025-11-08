package com.example.africaCulture.dto.response;

public class AgentRegistrationResponse {
    private String message;

    public AgentRegistrationResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
