package me.roohom.Spider.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;

/**
 * ClassName: JsoupCurriculum
 * Author: Roohom
 * Function:利用jsoup获取itcast首页的课程列表
 * Date: 2020/8/11 09:52
 * Software: IntelliJ IDEA
 */
public class JsoupCurriculum {
    @Test
    public void testJsoup() {
        //创建Document对象
        Document doc =null;
        try {
            //利用document对象来解析HTML中指定的元素
            doc = Jsoup.connect("http://www.itcast.cn").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取到所有的元素标签
        Elements lis = doc.select(".ulon>li");
        //遍历标签
        for (Element li : lis) {
            //System.out.println(li);
            //基于<li>再获取<a>元素
            Elements a = li.select("a");
            //利用元素对象获取其中的内容
            String text = a.text();
            System.out.println(text);
        }
    }



    @Test
    public void testJsoup2()
    {
        //创建Document对象
        Document doc =null;
        try {
            //利用document对象来解析HTML中指定的元素
            doc = Jsoup.connect("http://www.itcast.cn").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取到所有的元素标签
        Elements lis = doc.select(".ulon>li>a");
        for (Element li : lis) {
//            System.out.println(li);
//            System.out.println("====================");
            String text = li.text();
            System.out.println(text);
        }
    }

}
