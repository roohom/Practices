package com.roohom.demo.ClassDemo.File.InputStream;

import java.io.*;

/**
 * ClassName: FileCopyBuffer
 * Author: Roohom
 * Function:视频复制的四种方法:1.字节流每次读一个字节 2.字节流每次读多个字节 3.缓冲流一次读一个字节 4.缓冲流一次读多个字节
 * Date: 2020/7/30 17:05
 * Software: IntelliJ IDEA
 */
public class FileCopyBuffer {
    /**
     * 使用缓冲流每次读取多个字节的方式进行拷贝
     *
     * @param path1 被拷贝的文件路径
     * @param path2 拷贝后的存放路径
     */
    public static void copy4(String path1, String path2) {
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

    /**
     * 使用缓冲流每次读取一个字节的方式进行拷贝
     *
     * @param path1 被拷贝的文件路径
     * @param path2 拷贝后的存放路径
     */
    public static void copy3(String path1, String path2) {
        System.out.println("正在使用缓冲流每次读取一个字节的方式进行拷贝");
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(path1));
            bos = new BufferedOutputStream(new FileOutputStream(path2));
            /*核心代码开始*/
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
            /*核心代码结束*/
            bos.flush();//把此句写在上面的循环里和这里效果是不一样的，这样更快
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

    /**
     * 使用字节流每次读取多个字节的方式进行拷贝
     *
     * @param path1 被拷贝的文件路径
     * @param path2 拷贝后的存放路径
     */
    public static void copy2(String path1, String path2) {
        System.out.println("正在使用字节流每次读取多个字节的方式进行拷贝");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(path1);
            fos = new FileOutputStream(path2);
            /*核心代码开始*/
            byte[] buf = new byte[1024];
            int len = -1;
            while ((len = fis.read(buf)) != -1) {
                //读多个的，一定要以实际长度写入
                fos.write(buf, 0, len);
            }
            /*核心代码结束*/
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 使用字节流每次读取一个字节的方式进行拷贝
     *
     * @param path1 被拷贝的文件路径
     * @param path2 拷贝后的存放路径
     */
    public static void copy(String path1, String path2) {
        System.out.println("正在使用字节流每次读取一个字节的方式进行拷贝");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(path1);
            fos = new FileOutputStream(path2);
            /*核心代码开始*/
            int b = -1;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            /*核心代码结束*/
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //path1 为被拷贝文件所在的路径
        String path1 = "D:\\动态桌面AE86.mp4";     //size:31.3 MB
        //path2 拷贝之后存放的路径
        String path2 = "D:\\copy\\";
        //rename 为你想命名的名字
        String rename = "AE86.mp4";
        path2 = path2 + rename;
        long start = System.currentTimeMillis();
        //copy(path1, path2);    //时间太长
        copy2(path1, path2);      // 204毫秒
//        copy3(path1,path2);    // 784毫秒
//        copy4(path1,path2);    // 56毫秒
        long end = System.currentTimeMillis();
        System.out.println("本次执行时间为:" + (end - start) + "毫秒");
    }
}
