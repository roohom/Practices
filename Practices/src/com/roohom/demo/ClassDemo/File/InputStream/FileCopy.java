package com.roohom.demo.ClassDemo.File.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: FileCopy
 * Author: Roohom
 * Function:将“file.txt”中的内容拷贝到新的“file2.txt”
 * Date: 2020/7/30 15:01
 * Software: IntelliJ IDEA
 */
public class FileCopy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("file.txt");
            fos = new FileOutputStream("file2.txt");
            byte[] buf = new byte[1024];


            int len = -1;
            while ((len = fis.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }

//            int num = 0;
//            //装车读取(装箱读取)
//            while ((num = fis.read(buf)) != -1) {
//                String str = new String(buf,0,num);
//                fos.write(str.getBytes());
//            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
