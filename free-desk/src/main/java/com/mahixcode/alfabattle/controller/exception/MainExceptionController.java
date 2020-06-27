package com.mahixcode.alfabattle.controller.exception;

import com.mahixcode.alfabattle.exception.ClientException;
import com.mahixcode.alfabattle.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@ControllerAdvice
public class MainExceptionController extends ResponseEntityExceptionHandler {

    @Nonnull
    @ExceptionHandler({
            NotFoundException.class,
    })
    public ResponseEntity<Object> notFoundException(@Nonnull final ClientException exp) {
        return processException(exp.getMessage(), HttpStatus.NOT_FOUND);
    }

    @Nonnull
    private static ResponseEntity<Object> processException(@Nullable final String message, @Nonnull final HttpStatus status) {
        return new ResponseEntity<>(new ErrorResponse(message), status);
    }
}
