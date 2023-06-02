package com.ali.project.Java8Core.miscellaneous;

public class SyntheticConstructor {
    private SyntheticConstructor() {}
    class Inner {
        // Compiler will generate a synthetic constructor since
        // SyntheticConstructor() is private.
        Inner() { new SyntheticConstructor(); }
    }
}
