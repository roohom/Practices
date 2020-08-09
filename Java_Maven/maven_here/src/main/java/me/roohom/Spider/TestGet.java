package me.roohom.Spider;

import com.sun.java.swing.plaf.windows.WindowsDesktopPaneUI;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * ClassName: TestGet
 * Author: Roohom
 * Function:
 * Date: 2020/8/9 16:11
 * Software: IntelliJ IDEA
 */
public class TestGet {
    public static void main(String[] args) {
        String indexurl = "http://www.itcast.cn";

        try {
            URL url = new URL(indexurl);

            URLConnection urlConnection = url.openConnection();

            InputStream input = urlConnection.getInputStream();

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
