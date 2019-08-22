package com.luxing.Aug.eighteen;

import java.io.File;
import java.io.FileReader;

/**
 * 题目：给出文件夹列出文件夹下面的目录。1.实现不对子文件加展开的；2.同时展开子文件夹的。
 *
 */
public class InterviewListAllFile {
    /**
     *读取当前文件夹下所有文件。
     * @param drectory 目录
     *
     */
    public  static void listPresentFile(String drectory){
        File open=new File(drectory);
        if(open.exists()){
            for(File temp:open.listFiles()){
                if (temp.exists()){
                    System.out.println(temp.getName());
                }
            }
        }
    }
    /**
     * 读取所有文件：
     * 思路：加入层级，是目录则递归调用自己，不是目录则输出当前所有文件，并让层级-1；
     * @param drectory
     *
     */

    public static void listAllFils(String drectory){
        File open =new File(drectory);
        useDrectory(open,0);
    }
    public  static void useDrectory(File drectory,int level){
        if(drectory.isDirectory()){
            for(File temp:drectory.listFiles()){
                System.out.println(temp.getName());
                useDrectory(temp,level++);
            }
        }else {
            for(int i=0;i<level;i++){
                System.out.print("-");
            }
                System.out.println(drectory.getName());
        }
    }
    public static void main(String[] args) {
        //listPresentFile("D:\\Program Files (Self)\\ProgramDate\\textDate");
        listAllFils("D:\\Program Files (Self)\\ProgramDate");
    }
}
