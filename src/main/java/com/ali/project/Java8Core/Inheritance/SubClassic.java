package com.ali.project.Java8Core.Inheritance;

public class SubClassic extends SuperClass{
    public static void main(String[] args) {
//        SubClass sc = new SubClass("abba");
        SubClassic sct = new SubClassic("Spring");
        sct.printName("Boot");
    }

    public SubClassic(String name) {
        super(name);
        System.out.println("Inside SubClassTwo contructor");
    }

    @Override
    public int sum(int a, int b) {
        return 0;
    }

    @Override
    public void sayGodIsGreat() {
        super.sayGodIsGreat();
    }

    public void printName(String name) {
        super.printName(name);
        System.out.println("inside subclass printName method");
        System.out.println(name);
    }
}
