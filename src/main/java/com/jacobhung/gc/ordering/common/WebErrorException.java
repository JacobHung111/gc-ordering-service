package com.jacobhung.gc.ordering.common;

import org.springframework.http.HttpStatus;

public class WebErrorException extends RuntimeException {
    private HttpStatus status;

    public WebErrorException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}