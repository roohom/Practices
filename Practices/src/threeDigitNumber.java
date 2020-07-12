import java.util.Scanner;

/**
 * ClassName: threeDigitNumber
 * Author: Roohom
 * File: threeDigitNumber
 * Date: 2020/7/12 21:33
 * Software: IntelliJ IDEA
 */
public class threeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int a = sc.nextInt();
        int l = a%10;
        int m = a/10%10;
        int h = a/100%10;
        System.out.println(a+"的百位是:"+h+",十位是:"+m+",个位是:"+l);

    }
}
