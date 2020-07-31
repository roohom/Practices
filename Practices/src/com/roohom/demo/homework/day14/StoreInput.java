package com.roohom.demo.homework.day14;

import java.io.*;

/**
 * ClassName: StoreInput
 * Author: Roohom
 * Function:不使用Scanner来存储键盘录入的数据
 * Date: 2020/7/31 20:28
 * Software: IntelliJ IDEA
 */
public class StoreInput {
    public static void main(String[] args) {
        InputStream in = System.in;
        try {
            InputStreamReader isr = new InputStreamReader(in,"utf-8");
            BufferedReader br = new BufferedReader(isr);
            //System.out.println(br.readLine());
            //将读取到的写入文件

            BufferedWriter bw = new BufferedWriter(new FileWriter("data1.txt"));
            bw.write(br.readLine());

            bw.flush();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
