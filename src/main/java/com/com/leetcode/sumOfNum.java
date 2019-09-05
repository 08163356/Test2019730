package com.com.leetcode;


import java.util.HashMap;

public class sumOfNum {
    public static void main(String[] args) {
        int []arrays={3,5,9,5};

        for (int a:
                twoSum(arrays,10)) {
            System.out.print(a+" ");
        }
    }



        public static int[] twoSum(int[] nums, int target) {
//            int []a=new int [2];
//            int k=0;
//            for (int i=0;i<nums.length-2;i++){
//                for(int j=i+1;j<nums.length;j++){
//                    if(target==(nums[i]+nums[j])){
//                            a[k]=i;
//                            a[k+1]=j;
//                    }
//                }
//            }
//            return a;
            int[] indexs = new int[2];
            // 建立k-v ，一一对应的哈希表
            HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
            for(int i = 0; i < nums.length; i++){
                if(hash.containsKey(nums[i])){
                    indexs[0] = i;
                    indexs[1] = hash.get(nums[i]);
                    return indexs;
                }
                // 将数据存入 key为补数 ，value为下标
                hash.put(target-nums[i],i);
            }
            return indexs;
        }
}
