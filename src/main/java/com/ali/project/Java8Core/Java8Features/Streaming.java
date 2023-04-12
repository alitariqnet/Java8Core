package com.ali.project.Java8Core.Java8Features;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streaming {
    private static final Logger log =
            LogManager.getLogger(Streaming.class);
    
    // static block can be written here but not inside the main method
    // this code block will run once on the loading and/or initialization of the class
    // and not with the time of creation of every object of the class
    static {
        log.info("inside static block inside Streaming");
    }

    // this instance block will run every time an object is created
    {
        log.info("inside instance block");
    }
    public static void main(String[] args) throws InterruptedException {
        //instance block will print two times
        Streaming st = new Streaming();
        Streaming sr = new Streaming();

        List l = Arrays.asList("Ali","Arsalan","Ahsan","Ammar","Bill","Becky","Billy",
                "Bilal","Careem","Dan","Elephant","Fahad","George",
                "Hamid","Imran","Johnny","James","Jamil","Josephine");

        // example of stream with forEach with method reference
        l.stream().forEach(System.out::println);

        String hello = "Hello to the world!";
    try {
        IntStream s2 = hello.chars();
        s2.forEachOrdered(x-> System.out.print(x+", "));
        Thread.sleep(2000);
        // this line causing error because s2 stream is already closed
//        s2.forEach(x-> System.out.print(x+", "));
    }catch (Exception e){
        log.error("some error");
        e.printStackTrace();
    }finally{
        log.info("ending execution!");
    }
        IntStream.of(4,3,6,9,4,5,3,3,6,7,8,7,4,3,5,7,6,7,4,6,5,6,3)
                .sorted()
                .forEachOrdered(System.out::print);
        System.out.println();
        Arrays.asList("abubakar","ali","umar","usman","khalid","saad","saeed","muaaz")
                .stream().sorted().forEach(System.out::print);
        System.out.println();
        Arrays.asList("abubakar","ali","umar","usman","khalid","saad","saeed","muaaz")
                .stream().filter(x->x.contains("a")).forEach(System.out::print);
        System.out.println();
        IntStream.of(4,3,6,9,4,5,3,3,6,7,8,7,4,3,5,7,6,7,4,6,5,6,3)
                .filter(x->x>3&&x<7)
                .forEachOrdered(System.out::print);
        System.out.println();
        IntStream.rangeClosed(1,100)
                .filter(x->x%2==1)
                .skip(1)
                .forEach(System.out::print);
        System.out.println();
        System.out.println(IntStream.of(5,6,3).reduce(6, (a, b) -> a+b));
        List<String> list = new LinkedList();
        Arrays.asList("abubakar","ali","umar","usman","khalid","saad","saeed","muaaz")
                .stream().filter(x->x.contains("s")).collect(Collectors.toList());
        System.out.println(list);
        // 13. Reduction - sum
//        double total = Stream.of(7.3, 1.5, 4.8)
//                .reduce(0.0, (Double a, Double b) -> a + b);
//        System.out.println("Total = " + total);

        // 14. Reduction - summary statistics
//        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
//                .summaryStatistics();
//        System.out.println(summary);
    }

}
