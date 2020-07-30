# `IO Stream`

## `FileOutputStream`常用方法
- 写
    - `write(int b)` 向文件中写入一个字节数据
    - `write(byte[] buf)` 向文件中写入多个字节数据(把字节数组中的数据全部写入)
    - `write(byte[] buf, int offset, int len)` 向文件中写入多个字节数据
        - `byte[] buf` : 是字节数组
        - `int offset` : 索引位置(起始位置)  
        - `int len`    : 长度(偏移量),向后取len个字节的数据
    - `close()` 关闭输出流        
    
    - 补充String类中的方法
        - 字符串转byte数组 即:`String` -> `byte[]`
        - `byte[] getBytes[]`
        
    - 可能出现的问题以及解决办法:
        - 没有换行
            - 解决:在`write()`中添加"\r\n"
        - 写入的数据将之前的存在的数据都覆盖了   
            - 解决:`FileOutputStream类`的构造方法中有一个参数boolean append用来进行是否在原数据后追加写入，是的话，设置为true
- 读
    - `close()`
    - `int read()` 读一个字节数据
    - `int read(byte[] bys)` 读取多个字节        
    - `int read(byte[] bys, int offset, int len)` 从起始位置offset开始读取len个长度的字节
    
- 读写结合，一种高速的写方法
    - 示例:
        ~~~java
        public class FileCopy {
            public static void main(String[] args) {
                FileInputStream fis = null;
                FileOutputStream fos = null;
                try {
                    fis = new FileInputStream("D:\\initialD.png");
                    fos = new FileOutputStream("D:\\copy\\initialD.jpg");
                    byte[] buf = new byte[1024];
                    /*
                    //一个字节一个字节地读
                    int c ;
                    while ((c=fis.read())!=-1)
                        fos.write(c);
        
                     */
                    int len = -1;
                    while ((len = fis.read(buf)) != -1) {
                        fos.write(buf, 0, len);
                    }
                    
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        assert fis != null;
                        fis.close();
                        assert fos != null;
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        ~~~    
    
## 高效流
高效流:字节高效流、字符高效流
- 字节高效流：    
    - 本质:字节输入缓冲流只是提供缓冲区，本身不能读取文件，需要依赖于字节输入流实现读取数据
    - 字节输入缓冲流:BufferedInputStream
        - 高效的字节输入流, 封装 普通的字节输入流, 提供缓冲区
        - `public BufferedInputStream(InputStream is)`
        - 示例:`BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file_path"))`
    - 字符输出缓冲流:BufferedOutputStream
        - 高效的字节输出流, 封装 普通的字节输出流, 提供缓冲区
        - `public BufferedOutputStream(OutputStream is)`
        - 示例:`BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file_path"))`