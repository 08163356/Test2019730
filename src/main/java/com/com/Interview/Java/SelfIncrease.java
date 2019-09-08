package com.com.Interview.Java;

import java.util.Random;

public class SelfIncrease {
    public static void main(String[] args) {
        int []arrays={1,2,3,4,5,6,7,8,9};
        System.out.println(NumOfStep(arrays));
    }

    public static int NumOfStep(int []arrays) {

        int count=0;
        if(arrays.length!=0){
            int Step=(int)(Math.random()*(arrays.length/2));

            int theLastNum=arrays[arrays.length-1];
           while (Step<(arrays.length)){
               Step=Step+arrays[Step];
               count++;
           }
           if((Step==arrays.length)&&(theLastNum==arrays[Step-1])){
               return count;
            }
           if (Step>arrays.length){return -1;}

        }
        else {return -1;}
       return 0;
    }

}
