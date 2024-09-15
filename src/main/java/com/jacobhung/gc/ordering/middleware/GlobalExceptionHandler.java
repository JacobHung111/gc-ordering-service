package com.jacobhung.gc.ordering.middleware;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jacobhung.gc.ordering.common.WebErrorException;
import com.jacobhung.gc.ordering.model.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(WebErrorException.class)
    public ResponseEntity<ErrorResponse> handleItemNotFoundException(WebErrorException ex) {
        HttpStatus httpStatus = ex.getStatus();
        ErrorResponse errorResponse = new ErrorResponse(httpStatus.value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, httpStatus);
    }
}
