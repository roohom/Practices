package me.roohom.Spider.Jsoup;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

/**
 * ClassName: JdSpider
 * Author: Roohom
 * Function:
 * Date: 2020/8/11 14:47
 * Software: IntelliJ IDEA
 */
public class JdSpider {

    @Test
    public void testRequest() {
        String url = "";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.105 Safari/537.36");

        try {
            CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
            HttpEntity responseEntity = httpResponse.getEntity();
            String html = EntityUtils.toString(responseEntity);
            System.out.println(html);

            httpResponse.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
