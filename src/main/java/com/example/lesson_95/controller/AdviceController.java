package com.example.lesson_95.controller;

import com.example.lesson_95.exps.AppBadRequestException;
import com.example.lesson_95.exps.CategoryNotFoundException;
import com.example.lesson_95.exps.ItemNotFoundException;
import com.example.lesson_95.exps.MethodNotAllowedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdviceController {
    @ExceptionHandler({AppBadRequestException.class, ItemNotFoundException.class, MethodNotAllowedException.class,
            CategoryNotFoundException.class})
    public ResponseEntity<String> handleException(RuntimeException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<?> handleNotValidException(RuntimeException e) {
        e.printStackTrace();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
}
