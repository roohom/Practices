package me.roohom.Spider.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;

/**
 * ClassName: JsoupGetNews
 * Author: Roohom
 * Function:Jsoup爬取一篇新闻
 * Date: 2020/8/11 10:07
 * Software: IntelliJ IDEA
 */
public class JsoupGetNews {
    //新闻地址"https://news.163.com/20/0720/09/FHVHQ2N80001899O.html"

    @Test
    public void jsoupGetNews() {
        String url = "https://news.163.com/20/0720/09/FHVHQ2N80001899O.html";
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //获取新闻标题
        Elements h1Elements = doc.select("#epContentLeft > h1");
        String title = h1Elements.text();
        System.out.println("新闻标题:" + title);

        //获取新闻日期
        Elements timeAndSource = doc.select(".post_time_source");
        String date = timeAndSource.text().split(" ")[0];
        System.out.println("新闻日期:" + date);

        //获取新闻来源
        Elements sourceLs = doc.select("#ne_article_source");
        String source = sourceLs.text();
        System.out.println("新闻来源:" + source);

        //正文
        Elements elements = doc.select("#endText > p");
        for (Element element : elements) {
            System.out.println(element.text());
        }

        //作者
        Elements sourceAndAuthors = doc.select(".left");
        String author = sourceAndAuthors.text().split("：")[2];
        System.out.println("新闻作者:"+author);
//        for (Element sa : sourceAndAuthors) {
//            System.out.println(sa.text());
//        }
    }
}
