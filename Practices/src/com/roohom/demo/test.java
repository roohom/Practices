package com.roohom.demo;

import java.io.*;
import java.util.*;

/**
 * ClassName: test
 * Author: Roohom
 * Function:
 * Date: 2020/7/29 00:27
 * Software: IntelliJ IDEA
 */

public class test {
    public static void main(String args[]) throws IOException {
        BufferedReader buf = new BufferedReader(new FileReader("stu.txt"));
        BufferedWriter bs = new BufferedWriter(new FileWriter("stu"));
        bs.write(1);

    }
}