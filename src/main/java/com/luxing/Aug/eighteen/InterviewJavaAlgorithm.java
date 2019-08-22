package com.luxing.Aug.eighteen;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class InterviewJavaAlgorithm {
    public static void main(String[] args) {
        int []a={11,99,6,4,8,1,46};
        long programRunTime=System.currentTimeMillis();
        //运行程序
        bubbleSort(a);
        System.out.println();
        System.out.println(System.currentTimeMillis()-programRunTime+"ms");
    }
    /**
     * 二分查找
     * @param arrays 要查询的数组
     * @param index  要查询的值
     * @return thelocation 数组中的位置
     * 思路：判断中位数index和middle的值，>则从middle右边开始查询，<则从左边开始查询。
     */
    public static int binarySearch(int []arrays, int index){
        int end =arrays.length-1;
        int begin=0;
        int middle;
        while(begin<=end){
            middle=(end+begin)/2;
            if(arrays[middle]==index){
                return middle+1;
            }
            if(arrays[middle]<index){
                begin=middle+1;
            }
            if(arrays[middle]>index){
                end=middle-1;
            }
        }
        return  -1;
    }

    /**
     * 冒泡排序：按从小到大自动输出排序结果
     * @param arrays
     * @return
     * 思路：响铃元素之间相互比较，左边比右边大则交换。优化是加入标志位，true为发生过交换，false为未发生过交换。如果未发生过交换则推出，发生过交换则变为true，默认为未发生过交换。
     * 作用范围：适合于数量少的排序，数量大的用其他排序
     * 时间复杂度：O（n^2）
     */
    public static int bubbleSort(int []arrays){
        boolean flag=false;
        for(int i=0;i<arrays.length-1;i++){
            if(!flag){break;}
            flag=true;
                for (int j=1;j<arrays.length-1-i;j++){
                    //-1是防止数组溢出，-i是大的数都冒泡到最后面了，就可以不用比较了
                    if(arrays[j]>arrays[j-1]){
                        flag=false;
                        int temp=arrays[j];
                        arrays[j]=arrays[j-1];
                        arrays[j-1]=temp;
                    }
                }
        }
        for(int i=0;i<arrays.length-1;i++){
            System.out.print(arrays[i]+" ");
        }
        return -1;
    }


    public static void insertSort(int []arrays){

    }
}
