package com.dev.tim.ecomproject.exception.handler;

import com.dev.tim.ecomproject.dto.ExceptionResponseDTO;
import com.dev.tim.ecomproject.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductControllerExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity handleProductNotFoundException(ProductNotFoundException ex) {
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(ex.getMessage(), 404);
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
    }
}
