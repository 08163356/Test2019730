/*
*
*对文件进行拷贝
*
 */

package com.luxing.Aug.eighteen;
import javax.swing.*;
import java.io.*;
public class InterviewFileOP {
    public static void main(String[] args) {
//        File txt1=new File("file1.txt");
//        File txt2=new File("file2.txt");
//
//        BufferedReader bufferedReader=null;
//        try {
//            txt1.createNewFile();
//            txt2.createNewFile();
//            FileWriter fileWriter=new FileWriter(txt1,true);
//            FileWriter fileWriter1=new FileWriter(txt2,true);
//            fileWriter.append("if you can do the thing better");
//            fileWriter1.append("maybe you have chance to stay here, ");
//            fileWriter.flush();
//            fileWriter.flush();
//            file(txt1,txt2);
//            bufferedReader=new BufferedReader(new FileReader(txt1));
//            String tempStr;
//            while ((tempStr=bufferedReader.readLine())!=null){
//                System.out.println(tempStr);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        file("D:\\Program Files (Self)\\ProgramDate\\textDate\\source.txt","D:\\Program Files (Self)\\ProgramDate\\textDate\\target.txt");
        }
    public static void file(String source,String target){
        InputStream in=null;
        OutputStream out=null;
        try {
            in=new FileInputStream(source);
            out =new FileOutputStream(target);
            byte [] read1=new byte[1024];
            int bytereade;
            while ((bytereade=in.read(read1))!=-1){
                out.write(read1,0,bytereade);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    }
