package com.roohom.demo.ClassDemo.File.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * ClassName: FileOutputDemo
 * Author: Roohom
 * Function:使用输出流进行文件的写操作
 * Date: 2020/7/30 11:07
 * Software: IntelliJ IDEA
 */
public class FileOutputDemo {
    public static void main(String[] args) {
        try {
            //1.创建输出流对象
            //2.关联一个文件
            //当关联的文件不存在时，会自动创建该文件
            //如果是关联文件路径，如果路径不存在就会报错
            FileOutputStream fos = new FileOutputStream("Student.txt");

            //3.使用流对象中的方法向文件中写入数据
            fos.write('a');
            fos.write('c');
            fos.write('b');
            fos.close();
            //4.写入完成后需要关闭流
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
