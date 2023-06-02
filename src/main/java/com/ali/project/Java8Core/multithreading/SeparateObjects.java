package com.ali.project.Java8Core.multithreading;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SeparateObjects {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();

        Thread thread1 = new Thread(runnable, "Thread-1");
        Thread thread2 = new Thread(runnable, "Thread-2");

        thread1.start();
        thread2.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getId());
                System.out.print(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getThreadGroup());
                System.out.println(Thread.currentThread().getPriority());
                System.out.println(Thread.currentThread().getState());
                System.out.println(Arrays.stream(Thread.currentThread().getStackTrace()).collect(Collectors.toList()));
            }
        }).start();
    }
}
