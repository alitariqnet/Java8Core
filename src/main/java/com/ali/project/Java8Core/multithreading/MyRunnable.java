package com.ali.project.Java8Core.multithreading;

public class MyRunnable extends Thread{
//    private int count = 0;

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();
        MyRunnable myRunnable1 = new MyRunnable();
        myRunnable1.run();
    }
    @Override
    public void run() {
        int count = 0;
        int separateCount = 0;
        for (int i = 0; i < 10; i++) {
            count++;   //3
            System.out.println("Thread ID: "+Thread.currentThread().getId()+" count: "+count);
            separateCount++;
            // Thread 2,  count=3
            System.out.println(Thread.currentThread().getId()+ " : " +Thread.currentThread().getName()+" : count : "+count
                    +" and separate count : "+separateCount); //3
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
