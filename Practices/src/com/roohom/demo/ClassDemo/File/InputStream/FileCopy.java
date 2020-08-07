package com.roohom.demo.ClassDemo.File.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: FileCopy
 * Author: Roohom
 * Function:将“Student.txt”中的内容拷贝到新的“file2.txt”
 * Date: 2020/7/30 15:01
 * Software: IntelliJ IDEA
 */
public class FileCopy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\initialD.png");
            fos = new FileOutputStream("D:\\copy\\initialD.jpg");
            byte[] buf = new byte[1024];
            /*
            //一个字节一个字节地读
            int c ;
            while ((c=fis.read())!=-1)
                fos.write(c);

             */
            int len = -1;
            while ((len = fis.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fis != null;
                fis.close();
                assert fos != null;
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
