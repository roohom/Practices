package me.roohom.Spider.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

/**
 * ClassName: JsoupDemo
 * Author: Roohom
 * Function:演示jsoup
 * Date: 2020/8/11 09:41
 * Software: IntelliJ IDEA
 */
public class JsoupDemo {
    @Test
    public void testJsoup() {
        //创建一个Document对象
        //开发中测试是可以使用，但是正式环境不可以使用
//        Document doc = null;
//        try {
//            doc = Jsoup.connect("http://www.itcast.cn").get();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        /*
        弊端:
        无法使用请求头
        在实际开发中，通常都要把java爬虫模拟成一个浏览器
         */
        //System.out.println(doc);

        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>方式二:通过jsoup获取document对象</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    \n" +
                "</body>\n" +
                "</html>";
        Document document = Jsoup.parse(html);
        String title = document.title();
        System.out.println(title);
    }
}
