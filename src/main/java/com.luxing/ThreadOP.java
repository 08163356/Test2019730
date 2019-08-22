package com.luxing;

public class ThreadOP {
    public static void main(String[] args) {
        Thread thread=new Thread(){
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.print(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
//        Thread thread11=new ThreadCreate2();
        thread.start();
//        thread11.start();
    }
    public void main (){
        System.out.println("hello");
    }
}
//class ThreadCreate1 extends Thread{
//    @Override
//    public void run() {
//        for(int i=0;i<10;i++){
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        }
//}
class ThreadCreate2 extends Thread{
    @Override
    public void run() {
        for(char i='a';i<'k';i++){
            System.out.print(i+" ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}