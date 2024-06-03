package com.dev.tim.ecomproject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionResponseDTO {

    private String message;
    private int code;

    public ExceptionResponseDTO(String message, int code) {
        this.message = message;
        this.code = code;
    }
}
