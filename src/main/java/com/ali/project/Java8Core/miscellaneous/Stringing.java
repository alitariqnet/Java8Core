package com.ali.project.Java8Core.miscellaneous;

import java.util.Arrays;

public class Stringing {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abcd");
        
//        System.out.println(stringBuilder.reverse());
        String [] strArr ={"abc","def","ghi","jkl","mno","pqr","stuv","wxyz"};
//        String.join(strArr);
//        Arrays.stream(strArr).forEach(System.out::print);
        stringBuilder.insert(3,"qwer");
        System.out.println(stringBuilder);
        stringBuilder.replace(3,7,"xyz");
        System.out.println(stringBuilder);
        stringBuilder.delete(3,6);
        System.out.println(stringBuilder);
    }
}
