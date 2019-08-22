package com.luxing;

import java.security.PublicKey;

public class threadRunnableOP extends ThreadOP implements Runnable{

    public  void testFunction(){
        ThreadOP threadOP= new ThreadOP();
        threadOP.main();
    }

    public static void main(String[] args) {
        threadRunnableOP threadRunnableOP=new threadRunnableOP();
        threadRunnableOP.testFunction();
        Thread thread=new Thread(threadRunnableOP);
        thread.start();
    }
      @Override
      public void run() {
          System.out.println("i can do it");
      }

}

