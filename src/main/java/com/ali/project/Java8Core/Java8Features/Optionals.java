package com.ali.project.Java8Core.Java8Features;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

public class Optionals {
    private static final Logger log =
            LogManager.getLogger(Optionals.class);
    public static void main(String[] args) {
        optionalTest();
    }
    public static void optionalTest(){
        String greet = null;
        Optional<String> checkGreet = Optional.ofNullable(greet);
        log.info(checkGreet.isPresent());
    }
}
