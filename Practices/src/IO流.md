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