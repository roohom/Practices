import sun.awt.geom.AreaOp;

/**
 * ClassName: testScanner
 * Author: Roohom
 * File: testScanner
 * Date: 2020/7/12 11:25
 * Software: IntelliJ IDEA
 */

import java.util.Scanner;

public class testScanner {
    public static void main(String[] args) {
        System.out.println("本案例用于尝试Scanner扫描接收用户的输入");

        //创建Scanner类
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        System.out.println(s1);
    }
}
