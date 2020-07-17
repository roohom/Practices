package com.roohom.demo.ClassDemo; /**
 * ClassName: com.roohom.demo.ClassDemo.modHun
 * Author: Roohom
 * Function: 对一个三位数分别判断其个十百位并打印输出
 * Date: 2020/7/13 16:13
 * Software: IntelliJ IDEA
 */
import java.util.Scanner;


public class modHun {
    public static void main(String[] args) {
        System.out.print("请输入一三位数，我将判断它的个十百位:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("你输入的是:"+a);

        int m = a%10;   //个位
        int n = a/10%10;// 十位
        int p = a/100; // 百位
        System.out.println(a+"的百位是:"+p+",十位是:"+n+",个位是:"+m);

    }
}
