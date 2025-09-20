package com.example.africaCulture.dto.response;

public class GenerousGiverResponse {
    private String message ;

    public GenerousGiverResponse(String message) {
        this.message = message;
    }

    public GenerousGiverResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "GenerousGiverResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}
