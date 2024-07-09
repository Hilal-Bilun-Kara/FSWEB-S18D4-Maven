package com.workintech.s18d1.exception;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class BurgerErrorResponse {
    private String message;
}
