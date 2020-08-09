package me.roohom.Spider;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * ClassName: TestPost
 * Author: Roohom
 * Function:post方式请求网页
 * Date: 2020/8/9 16:18
 * Software: IntelliJ IDEA
 */
public class TestPost {
    public static void main(String[] args) {
        String indexurl = "http://www.itcast.cn";
        try {
            URL url = new URL(indexurl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");

            /****************POST提交数据***********************/
            //使用输出流向服务器发送请求
            //默认输出流是关闭的
//            httpURLConnection.setDoOutput(true);
//            OutputStream output = httpURLConnection.getOutputStream();
//            output.write("your_args".getBytes());


            InputStream input = httpURLConnection.getInputStream();
            int len=-1;
            byte[] buf = new byte[1024];
            while ((len=input.read(buf))!=-1)
            {
                String str = new String(buf,0,len);
                System.out.println(str);
            }

            input.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
