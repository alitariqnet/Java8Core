package com.ali.project.Java8Core.Inheritance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SubClass extends SuperClass{
    public static Logger log = LogManager.getLogger(SubClass.class);
    String name;
    public SubClass(String name) {
        //super should be the first line here can't write anything before its execution
        super(name);
        log.debug(log.hashCode());
        log.info("Inside sub class after sending in Super");
        this.name = name;
    }

    // no need to implement the print() method
    public void sayHello(){
        log.info("Hello from subclass");
    }

    // override from dingdong interface
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    // overloaded above method with no problem
    public int sum(int a, int b,int c) {
        return a + b + c;
    }
    public static void main(String[] args) {

        SubClass sb = new SubClass("Umar");
        sb.sayHello();
//        SuperClass sp = new SubClass();
//        sp.sayHello();
//        SuperClass sp2 = new SubClass();
//        sp2.sayHello();
//        sp2.divideByZero();
//        sp2.sayGodIsGreat();
    }
}
