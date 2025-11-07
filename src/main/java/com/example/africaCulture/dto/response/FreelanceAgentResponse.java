package com.example.africaCulture.dto.response;

public class FreelanceAgentResponse {
    private String message;

    public FreelanceAgentResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "FreelanceAgentResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}
