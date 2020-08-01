package com.roohom.demo.homework.day14.MoveFileToNewPlace;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: MoveFile
 * Author: Roohom
 * Function:
 * Date: 2020/8/1 15:57
 * Software: IntelliJ IDEA
 */
public class MoveFile {
    public static List<String> getAllFile(File f, List<String> fileList) {
        FileFilterImpl ffi = new FileFilterImpl();
        ffi.setFileSuffix(".jpg");
        File[] files = f.listFiles(ffi);
        for (File file : files) {
            if (!file.isDirectory())
                fileList.add(file.getAbsolutePath());
        }
        return fileList;
    }

    /**
     * 使用缓冲流每次读取多个字节的方式进行拷贝
     *
     * @param path1 被拷贝的文件路径
     * @param path2 拷贝后的存放路径
     */
    public static void copy(String path1, String path2) {
        System.out.println("正在使用缓冲流每次读取多个字节的方式进行拷贝");
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(path1));
            bos = new BufferedOutputStream(new FileOutputStream(path2));
            /*核心代码开始*/
            int len = -1;
            byte[] buf = new byte[1024];
            while ((len = bis.read(buf)) != -1) {
                bos.write(buf, 0, len);
            }
            bos.flush(); //把此句写在上面的循环里和这里效果是不一样的，这样更快
            /*核心代码结束*/
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //获取指定目录下的所有图片文件
        String source_path = "D:\\copy";
        String target_path = "D:\\itcast";
        File f = new File(source_path);
        List<String> fileList = new ArrayList<>();
        System.out.println(getAllFile(f, fileList));
        //现在得到了存储有所有图片问价的目录地址的集合
        //下面进行复制
        for (int i = 0; i < fileList.size(); i++) {
            target_path += "\\图片"+i;
            target_path += ".jpg";
            System.out.println(target_path);
            copy(fileList.get(i), target_path);
            target_path = "D:\\itcast";
        }
    }
}
