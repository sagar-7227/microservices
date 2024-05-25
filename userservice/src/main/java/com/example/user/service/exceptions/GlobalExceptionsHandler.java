package com.example.user.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.example.user.service.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionsHandler {

    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundExceptions ex){
        
        String message = ex.getMessage();
        ApiResponse response = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);

    }
}
