package com.luxing;

public class OpArrays {
    public static void main(String[] args) {
        int []nums={0,1,0,3,12};
        OpArrays x=new OpArrays();
        x.moveZeroes(nums);
        for(int y:nums){
            System.out.print(y+" ");
        }
    }
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
        }
    }

