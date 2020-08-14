package me.roohom.Spider.Jsoup;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;

/**
 * ClassName: QiDianJsoup
 * Author: Roohom
 * Function:
 * Date: 2020/8/11 10:47
 * Software: IntelliJ IDEA
 */
public class QiDianJsoup {
    @Test
    public void testQiDianJsoup() {
        //初始化url
        String indexurl = "https://read.qidian.com/chapter/tW9aZ4K3JpWLTMDvzUJZaQ2/Jdlw90hDk_dp4rPq4Fd4KQ2";

        //创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建httpget请求对象
        HttpGet httpGet = new HttpGet(indexurl);

        //设置请求头
        httpGet.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.105 Safari/537.36");

        //使用httpclient对象，发送get请求，接收响应
        try {
            CloseableHttpResponse response = httpClient.execute(httpGet);

            HttpEntity entity = response.getEntity();
            //从响应对象中获取响应的内容(html)
            String html = EntityUtils.toString(entity);
            //System.out.println(html);

            Document document = Jsoup.parse(html);
            Elements bookName = document.select(".book-cover-wrap > h1");
            System.out.println("小说名:"+bookName.text());

//            document.select("")
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
