package com.luxing.Aug.eighteen;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 问题：输入文件加字符串，统计字符串在文件中出现的次数
 * 思路：按行检索
 * 步骤：
 * 1.读入文件
 * 2.判断是否已读完
 * 3.没有则继续判断stringName长度是否比当前行长度小，并且使用indexOf（）检测改行是否存在stringName。
 * 4.存在则产生（index+子字符串长度）后的子字符串，反复再改行检测直到结束
 */
public class InterviewCountStringNum {
    public static void main(String[] args) {
        System.out.println(count("D:\\Program Files (Self)\\ProgramDate\\textDate\\source.txt","of"));
    }
    /**
     * index 用以记录检索到字符的位置。
     * @param fileName  传入文件的路径及其名称
     * @param stringName 查询的字符
     * @return counter 出现stringName的次数
     */
    public  static int count(String fileName,String stringName){
        FileReader readFile= null;
        int counter=0;
        try {
            readFile = new FileReader(fileName);
            BufferedReader readContent=new BufferedReader(readFile);
            String temp="";
            while ((temp=readContent.readLine())!=null){
                int index=-1;
                while ((temp.length()>=stringName.length())&&(index=temp.indexOf(stringName))>=0){
                    counter++;
                    temp=temp.substring(index+stringName.length());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(readFile!=null){
                try {
                    readFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return counter;
    }
}
