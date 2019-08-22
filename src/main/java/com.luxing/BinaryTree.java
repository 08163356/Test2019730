package com.luxing;
/*
汉诺塔问题解决
 */
public class BinaryTree {
    public static void main(String[] args) {
        hanoi(3,1,2,3);
    }
    public static void hanoi(int num,int start,int middle,int end){
        if(num<=1){
            System.out.println(start+"-->"+end+" ");
        }else {
            hanoi(num-1,start,end,middle);
            System.out.print(start+"-->"+end+" ");
            hanoi(num-1,middle,start,end);
        }
    }
}
