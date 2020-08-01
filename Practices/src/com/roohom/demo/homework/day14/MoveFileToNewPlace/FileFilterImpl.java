package com.roohom.demo.homework.day14.MoveFileToNewPlace;

import java.io.File;
import java.io.FileFilter;

/**
 * ClassName: FileFilterImpl
 * Author: Roohom
 * Function:过滤器接口的实现类
 * Date: 2020/8/1 15:50
 * Software: IntelliJ IDEA
 */
public class FileFilterImpl implements FileFilter {

    //定义指定文件名后缀的变量
    String suffix;

    //用于接收指定后缀名的函数，对suffix进行赋值
    public String setFileSuffix(String suffix)
    {
        this.suffix = suffix;
        return suffix;
    }

    //重写accept方法
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) {
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(setFileSuffix(suffix));
    }
}
