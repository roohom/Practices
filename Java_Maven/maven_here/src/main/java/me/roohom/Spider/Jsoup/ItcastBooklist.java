package me.roohom.Spider.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: ItcastBooklist
 * Author: Roohom
 * Function:
 * Date: 2020/8/11 10:42
 * Software: IntelliJ IDEA
 */
public class ItcastBooklist {

    @Test
    public void getBooklist() {
        String url = "http://resource.ityxb.com/booklist/";
        String bookUrl = "http://resource.ityxb.com/booklist/find.html?filter%5Bsubject%5D=Python";
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //通过类选择器
        Elements heading = doc.select(".panel-heading > h3");
        System.out.println(heading.text());
        System.out.println("=====================================");

        //通过层级选择器 打印书记名单
        Elements elements = doc.select("div[class=book-list-hot-row] > a");
        for (Element element : elements) {
            System.out.println(element.text());
        }


        System.out.println("=============获得Python类书籍的名称和对应的价格==============");
        //通过id选择器

        Document docu = null;
        try {
            docu = Jsoup.connect(bookUrl).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String,String> bookMap = new HashMap<>();
        List<String> bookList = new ArrayList<>();
        List<String> bookPress = new ArrayList<>();
        List<String> bookPrice = new ArrayList<>();
        Elements bookNames = docu.select(".book-list-s-title > a");
        Elements bookPresses = docu.select(".book-list-s-press");
        Elements bookPrices = docu.select(".book-list-money");


        for (int i = 0; i < bookNames.size(); i++) {
            bookList.add(bookNames.get(i).text());
        }
        System.out.println(bookList);

        for (int i = 0; i < bookPresses.size(); i++) {
            bookPress.add(bookPresses.get(i).text());
        }
        System.out.println(bookPress);

        for (int i = 0; i < bookPrices.size(); i++) {
            bookPrice.add(bookPrices.get(i).text());
        }
        System.out.println(bookPrice);

        for (int i = 0; i < bookNames.size(); i++) {
            bookMap.put(bookList.get(i),"出版社:"+bookPress.get(i)+", 价格:"+ bookPrice.get(i));
        }

        for (String s : bookMap.keySet()) {
            System.out.println(s+"--"+bookMap.get(s));
        }


    }
}
