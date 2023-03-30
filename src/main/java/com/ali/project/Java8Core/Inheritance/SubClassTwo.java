package com.ali.project.Java8Core.Inheritance;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SubClassTwo extends SuperClass{
    public static void main(String[] args) {
        SubClass sc = new SubClass("abba");
//        SubClassTwo sct = (SubClassTwo)sc;

    }

    public SubClassTwo(String name) {
        super(name);
    }

    @Override
    public int sum(int a, int b) {
        return 0;
    }

    @Override
    public void sayGodIsGreat() {
        super.sayGodIsGreat();
    }
}
