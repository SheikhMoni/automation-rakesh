package com.mavenit.selenium.Sept.utils;

import java.util.Random;

public class UtilsHelper {

    public int generateRandomNumber(int size){
        Random rand = new Random();
        return rand.nextInt(size);
    }
}
