package com.workintech.s18d1.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class BurgerErrorException extends RuntimeException{

    private HttpStatus httpStatus;

    public BurgerErrorException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
