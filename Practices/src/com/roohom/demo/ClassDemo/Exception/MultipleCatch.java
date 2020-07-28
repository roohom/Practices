package com.roohom.demo.ClassDemo.Exception;


/**
 * ClassName: MultipleCatch
 * Author: Roohom
 * Function:多从Catch
 * Date: 2020/7/28 16:15
 * Software: IntelliJ IDEA
 */
public class MultipleCatch {
    public static void main(String[] args) {
        try{
            String str = null;
            int len = str.length();

        }
        //异常的书写必须是从小到大
        catch (NullPointerException e)
        {
            System.out.println("空指针异常");
        }
        catch (ClassCastException e)
        {
            System.out.println("类型转换异常");
        }
        catch (Exception e)// Exception是所有异常的父类
        {
            System.out.println("啥也不是");
        }
        finally {
            System.out.println("永远都会执行这里...");
        }
    }
}
