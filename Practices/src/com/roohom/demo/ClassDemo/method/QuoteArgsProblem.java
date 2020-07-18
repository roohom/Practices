package com.roohom.demo.ClassDemo.method;

/**
 * ClassName: QuoteArgsProblem
 * Author: Roohom
 * Function:参数问题，引用数据类型
 * Date: 2020/7/18 17:50
 * Software: IntelliJ IDEA
 */
public class QuoteArgsProblem {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        System.out.println("调用change方法之前:"+arr[1]);
        change(arr);
        System.out.println("调用change方法之后:"+arr[1]);
    }

    /**
     * @function 数组位置赋值
     * @param arr
     */
    public static void change(int[] arr)
    {
        arr[1]=200;
    }
}
//结论: 引用类型作为参数时，形参的改变直接影响实参