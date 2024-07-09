package com.workintech.s18d1.util;

import com.workintech.s18d1.exception.BurgerErrorException;
import org.springframework.http.HttpStatus;

public class BurgerValidaton {
    public static void checkName(String name) {
        if(name == null || name.isEmpty()){
            throw new BurgerErrorException("Name is null or empty", HttpStatus.NOT_FOUND);
        }
    }

}
