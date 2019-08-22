package com.luxing;

public class ThreadSafe implements  Runnable{

    public static void main(String[] args) {
        ThreadSafe threadSafe=new ThreadSafe();
        Thread thread1=new Thread(threadSafe);
        Thread thread2=new Thread(threadSafe);
        Thread thread3=new Thread(threadSafe);
        Thread thread4=new Thread(threadSafe);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

    @Override
    synchronized public void run() {
        for(int i=100;i>0;i--){
            System.out.println("tickets："+i+" ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
