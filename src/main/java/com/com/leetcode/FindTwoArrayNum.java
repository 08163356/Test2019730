package com.com.leetcode;

public class FindTwoArrayNum {
    public static void main(String[] args) {
        int [][]a={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(find(a,1));
    }
    public static int find(int [][]array,int target){
        if(array.length!=0){
            for(int i=0;i<array.length;i++){
                for (int j=0;j<array[i].length;j++){
                    if(array[i][j]==target){return 1;}
                }
            }
        }
        else {
            System.out.println("数组中没有元素");
        }
        return -1;
    }
    public static int findImprove(int [][]array,int target){
        if(array.length==0){
            return -1;
        }
        int m=0;
        int n=array[m].length-1;
        return 1;
    }
}
