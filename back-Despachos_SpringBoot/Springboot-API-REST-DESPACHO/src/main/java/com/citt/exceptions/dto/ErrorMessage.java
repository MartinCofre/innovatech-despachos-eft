package com.citt.exceptions.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Map;


@Data
public class ErrorMessage {
    private HttpStatus status;
    private String message;
    private Map<String, String> errors;

    public ErrorMessage(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public ErrorMessage(HttpStatus status, String message, Map<String, String> errors) {
        this.status = status;
        this.message = message;
        this.errors = errors;
    }
}
