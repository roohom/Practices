package com.roohom.demo.ClassDemo.File.FileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: FileOutputStreamAppend
 * Author: Roohom
 * Function:
 * Date: 2020/7/30 11:49
 * Software: IntelliJ IDEA
 */
public class FileOutputStreamAppend {
    public static void main(String[] args) {
        File file = new File("file.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file,true);
            for (int i = 0; i < 20; i++) {
                fos.write("\nTalk is cheap,show me your code!".getBytes());
            }
            fos.write("\r\n废话少说，放码过来！".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
