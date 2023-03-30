package com.ali.project.Java8Core.Inheritance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class SuperClass implements DingDongInterface {
    public static Logger log = LogManager.getLogger(SuperClass.class);
    String name;
    public SuperClass(String name) {
        log.info("Inside super class after sending in Super");
        this.name = name;

    }

    /**
     *
     */
    @Override
    public void printName() {

    }

    public void sayHello(){
        log.info("Hello from superclass");
    }

    /**
     *
     */
    @Override
    public void sayGodIsGreat() {
        System.out.println("Inside SuperClass and God is Great!");
    }

    public void divideByZero() throws ArithmeticException{
//            System.out.println(1 / 0);
    }

    public static void main(String[] args) {
//        SubClass sb = new SubClass();
//        sb.sayHello();

    }
}
