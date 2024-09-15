package com.jacobhung.gc.ordering.middleware;

import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.jacobhung.gc.ordering.common.WebErrorException;
import com.jacobhung.gc.ordering.model.ApiResponse;

import jakarta.servlet.http.HttpServletRequest;

@SuppressWarnings("null")
@ControllerAdvice
public class ApiResponseAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
            Class<? extends HttpMessageConverter<?>> selectedConverterType,
            ServerHttpRequest request, ServerHttpResponse response) {
        if (body instanceof ApiResponse) {
            return body;
        }
        return new ApiResponse<Object>(true, 200, "Request was successful", body);
    }

    @ExceptionHandler(WebErrorException.class)
    public ResponseEntity<ApiResponse<Void>> handleItemNotFoundException(WebErrorException ex,
            HttpServletRequest request) {
        HttpStatus httpStatus = ex.getStatus();
        ApiResponse<Void> errorResponse = new ApiResponse<>(false, httpStatus.value(),
                request.getMethod() + "Failed: " + ex.getMessage(), null);
        return new ResponseEntity<>(errorResponse, httpStatus);
    }

}
