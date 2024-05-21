package com.desafio.cadastro.model;

public class ResponseApi {
    private String message;

    public ResponseApi(String message) {
        this.message = message;
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
