package com.example.demo2;

import com.sun.tools.javadoc.Start;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019/3/5 09:14
 * @Author by lierniu
 */
public class Test {
    private static Object lock1=new Object();
    private static Object lock2=new Object();

    public static void main(String[] args) {

        new Thread() {
            @Override
            public void run() {
                synchronized (lock1) {
                    try {
                        Thread.sleep(100);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock2) {
                        System.out.println("thread1 get lock2");

                    }
                }
                System.out.println("thread  end");
            }

        }.start();

        new Thread(){
            @Override
            public void run() {
                synchronized (lock2) {
                    System.out.println("thread2 get lock2 hhh");
                    try {
                        Thread.sleep(200);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock1) {
                        System.out.println("thread2 get lock1");

                    }
                }
                System.out.println("thread2  end");
            }

        }.start();

        System.out.println("=====ceshi ");
    }
}
