package me.roohom.Spider.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;

/**
 * ClassName: getFlume
 * Author: Roohom
 * Function:
 * Date: 2020/8/17 22:01
 * Software: IntelliJ IDEA
 */
public class getFlume {
    @Test
    public void getFlumeInfo()
    {
        String url = "https://www.nosetime.com/search.php?x=0&y=0&word=";
        String yourFlume = "迪奥";
        Document doc = null;
        try {
            doc = Jsoup.connect(url+yourFlume).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(doc.text());
        //通过类选择器
        Elements heading = doc.select("div[class=detail] > a >  h2");
        for (Element element : heading) {
            System.out.println(element);
        }
        System.out.println(heading);
        System.out.println("=====================================");


    }
}
