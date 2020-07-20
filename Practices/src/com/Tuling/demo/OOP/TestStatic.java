package com.Tuling.demo.OOP;

/**
 * ClassName: TestStatic
 * Author: Roohom
 * Function:有无static修饰的区别
 * Date: 2020/7/20 15:35
 * Software: IntelliJ IDEA
 */
public class TestStatic {
    private int ot = 1;   //隶属于对象层级，每个对象都拥有独立的一份
    private static int cot =3; //隶属于类层级，也就是所有对象共享同一份

    //隶属于对象层级，使用对象.访问
    public void show(){
        System.out.println("ot="+this.ot);
        System.out.println("cot="+this.cot);
    }
    public static void test() //隶属于类层级，使用类名.访问
    {
        //System.out.println("ot="+ot); //报错
        System.out.println("cot="+cot);
    }



    public static void main(String[] args) {
        TestStatic ts = new TestStatic();
        ts.show();

        //调用静态方法或者静态变量
        TestStatic.test();
    }


}
