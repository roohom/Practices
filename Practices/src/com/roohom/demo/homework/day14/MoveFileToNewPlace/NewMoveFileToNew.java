package com.roohom.demo.homework.day14.MoveFileToNewPlace;

import java.io.*;

/**
 * ClassName: NewMoveFileToNew
 * Author: Roohom
 * Function:将一个目录下的文件拷贝到另一个文件夹下
 * Date: 2020/8/4 20:03
 * Software: IntelliJ IDEA
 */
public class NewMoveFileToNew {
    public static void main(String[] args) {
        File src = new File("D:\\copy");
        File target = new File("D:\\itcast");
        copyFile(src,target);

    }

    public static void copyFile(File src, File target) {
        File[] files = src.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isFile() && pathname.getName().endsWith(".jpg"))
                    return true;
                return false;
            }
        });

        for (File f : files) {
            try {
                FileInputStream fis = new FileInputStream(f);
                FileOutputStream fos = new FileOutputStream(new File(target, f.getName()));

                int len = -1;
                byte[] buf = new byte[1024];
                while ((len = fis.read(buf)) != -1) {
                    fos.write(buf, 0, len);
                }
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
