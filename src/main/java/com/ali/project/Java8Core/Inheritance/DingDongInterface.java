package com.ali.project.Java8Core.Inheritance;

public interface DingDongInterface {
    void printName();
    void sayHello();

    int sum(int a, int b);
    /*
    The purpose of the default method is to provide external functionality without breaking the
    existing implementations. The original motivation behind introducing the default method was
    to provide backward compatibility to the Collection Framework with the new lambda functions.

    The abstract class can have a state, and its methods can access the implementation's state.
    Although default methods are allowed in an interface, they can't access the implementation's state.

    Any logic we write in the default method should be with respect to other methods of the interface —
    those methods will be independent of the object's state.
     */
    default void sayGodIsGreat(){
        System.out.println("Inside DingDong interface and God is Great!");
    }

}
