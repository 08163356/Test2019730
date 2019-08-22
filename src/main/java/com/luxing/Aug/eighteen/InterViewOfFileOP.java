
package com.luxing.Aug.eighteen;
import java.io.*;

/**
 * 联系，对文件进行复制并输出
 * 创建文件
 */
public class InterViewOfFileOP {
    //对文件进行复制
    public static void copyFile(String source,String target){
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try {
            inputStream=new FileInputStream(source);
            outputStream=new FileOutputStream(target);
            byte []fireRead=new byte[1024];
            int byteToRead;
            while ((byteToRead=inputStream.read(fireRead))!=-1){
                outputStream.write(fireRead,0,byteToRead);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        outputFileContent(target);
    }
    //输出文件内容
    public static void  outputFileContent(String fileWillOpen){
        System.out.println(fileWillOpen+"：内容是");
        BufferedReader bufferedReader=null;
        try {
            bufferedReader=new BufferedReader(new FileReader(fileWillOpen));
            String str;
            while ((str=bufferedReader.readLine())!=null){
                System.out.println(str);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeContentToFile(String targetFile){

    }

    public static void main(String[] args) {
        copyFile("D:\\Program Files (Self)\\ProgramDate\\textDate\\source.txt","D:\\Program Files (Self)\\ProgramDate\\textDate\\target.txt");
    }
}
