package com.ali.project.Java8Core.Java8Features;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalProgramming {
    private static Logger log = LogManager.getLogger(FunctionalProgramming.class);

    public static void main(String[] args) {

        // Function functional interface
        Function<Long, String> adder = (value) -> String.valueOf(value + 3);
        String resultLambda = adder.apply((long) 8);
        log.info(resultLambda==String.class + resultLambda);

        // Predicate functional interface
        Predicate pr = new Predicate() {
            @Override
            public boolean test(Object o) {
                return o instanceof String;

            }
        };

        boolean check = pr.test(3);
        log.info(String.valueOf(check));
    }
}
