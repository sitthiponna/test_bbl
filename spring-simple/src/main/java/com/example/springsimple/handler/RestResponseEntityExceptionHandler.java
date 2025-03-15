package com.example.springsimple.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.HandlerMethodValidationException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class RestResponseEntityExceptionHandler {

    @ExceptionHandler(HandlerMethodValidationException.class)
    public Map<String, List<String>> handleValidationExceptions(HandlerMethodValidationException ex) {
        Map<String, List<String>> errorsMap = new HashMap<>();

        List<String> fieldsRequire = new ArrayList<>();
        ex.getAllErrors().forEach((error) -> {
            fieldsRequire.add(error.getDefaultMessage());
        });
        errorsMap.put("Fields is Require", fieldsRequire);
        return errorsMap;
    }
}

