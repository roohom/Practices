package com.roohom.demo.homework.day05;
import java.util.Scanner;

/**
 * ClassName: hw05
 * Author: Roohom
 * Function:
 *  1.键盘录入10个整数存入数组中
 * 	2.定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
 * 	3.定义一个方法打印原数组和处理后的数组
 * 	4.定义一个方法传入一个int类型数组，输出这个数组中只出现一次的数字及个数
 * Date: 2020/7/18 19:33
 * Software: IntelliJ IDEA
 */

public class oddLeftEvenRight {
    /**
     * Function:判断数组指定起止索引内元素是否都是偶数
     *
     * @param arr       目标数组
     * @param fromIndex 起始索引
     * @param endIndex  截止索引
     * @return true代表都是偶数 false代表不是
     */
    public static boolean ifArrayEven(int[] arr, int fromIndex, int endIndex) {
        for (int i = fromIndex; i <= endIndex; i++) {
            if (arr[i] % 2 == 0) {
                if (i == endIndex)
                    return true;
            }
            else
                return false;
        }
        return false;
    }

    //将奇数放在数组的左侧,偶数放在数组的右侧
    //从头向尾部扫描，如果扫描到奇数，不做操作，如果是偶数，把它赋值给temp保存，后面所有的数
    //向前移动一位，待移动完，把temp放置在末尾

    /**
     * Function: 把数组中的奇数都放在左边，偶数都放在右边
     * @param arr 目标数组
     */
    public static void oddLeftEvenRight(int[] arr) {
        int temp = 0;
        //int flag=0;
        // 测试:2 2 2 2 1 1 1 3 4 5
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                temp = arr[i];
                //idx = i;
                //后面的元素向前移动一位
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                //把刚才的偶数置于末尾
                arr[arr.length - 1] = temp;

                //判断后面的位置是不是都是偶数，如果是就停止后面的操作，退出循环
                if (ifArrayEven(arr, i , arr.length - 1)){
                    continue;}
                // 如果该位置是偶数，为了防止后面的元素前移后该位置还是偶数，必须将i-1来使得下次判断偶数还从该位置开始
                i--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Function:打印数组中只出现一次的数字
     * @param arr 传入的数组
     */
    public static void NumOnceAndCount(int[] arr) {
        //依次对每个位置上的数进行扫描，扫描的同时将此数与其他位置的数对比，如果相同，不做统计，如果不同，则计数
        // 双层循环

        int[] tempArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            tempArr[i] = count;
        }
        System.out.print("出现一次的数字有:");
        for (int k = 0; k < tempArr.length; k++) {
            if (tempArr[k] == 1) {
                System.out.print(arr[k] + " ");
            }
        }
    }

    public static void main(String[] args) {

        //键盘录入10个整数存入数组
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("请输入十个数，我将把奇数放左边，偶数放右边:");

        //开始输入
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        //打印原数组
        System.out.print("原   数  组:");
        printArray(arr);
        oddLeftEvenRight(arr);
        System.out.println();

        //打印处理后的数组
        System.out.print("处理后的数组:");
        printArray(arr);
        System.out.println();

        //统计出现一次的数字并打印出来
        NumOnceAndCount(arr);
        //测试
//        int[] arr = {2,2,2,2,1,2};
//        System.out.println(ifArrayEven(arr,0,5));

    }
}
