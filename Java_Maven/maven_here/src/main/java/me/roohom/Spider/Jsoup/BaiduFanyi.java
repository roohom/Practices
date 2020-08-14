package me.roohom.Spider.Jsoup;

import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: BaiduFanyi
 * Author: Roohom
 * Function:java爬取百度翻译
 * Date: 2020/8/11 11:36
 * Software: IntelliJ IDEA
 */

public class BaiduFanyi {

    @Test
    public void getFanyi() {
        //初始化url
        //一开始找错url了，折腾了半天不知道怎么不对,......
        //String indexurl = "https://fanyi.baidu.com/v2transapi?from=en&to=zh";
        String indexurl = "https://fanyi.baidu.com/sug";
        System.out.print("请输入你想翻译的单词:");
        String inputWord = new Scanner(System.in).next();
        //创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建httpget请求对象
        HttpPost httpPost = new HttpPost(indexurl);
        //设置请求头
        httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.105 Safari/537.36");
        httpPost.setHeader("accept","*/*");
        httpPost.setHeader("accept-encoding","gzip, deflate, br");
        httpPost.setHeader("accept-language","en-US,en;q=0.9,zh-CN;q=0.8,zh;q=0.7");
        httpPost.setHeader("content-type","application/x-www-form-urlencoded; charset=UTF-8");

        //设置参数，是给服务器发送的数据，也就是表单数据(浏览器中的Form Data)
        List<BasicNameValuePair> list = new ArrayList<>();
        list.add(new BasicNameValuePair("kw", inputWord));

        //创建一个请求实体对象(对象中存放了发送给服务器的数据)
        HttpEntity httpEntity = null;
        try {
            httpEntity = new UrlEncodedFormEntity(list,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        httpPost.setEntity(httpEntity);

        try {
            //使用httpClient发送post请求
            CloseableHttpResponse response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            //接收到服务器传回的数
            InputStream content = entity.getContent();
            if (response.getStatusLine().getStatusCode() == 200) {
                System.out.println("请求成功了！");
                int length = -1;
                byte[] buf = new byte[1024];
                String string ="";
                while ((length = content.read(buf)) != -1) {
                    String str = new String(buf, 0, length);
                    string += str;
                    //System.out.println(str);
                }
                //使用json解析传回的结果数据，否则显示为16进制字符，不人性化
                JSONObject jo = new JSONObject(string);
                String result = jo.toMap().get("data").toString().split("},")[0];
                //System.out.println(result);
                System.out.println(inputWord+":"+result.substring(4,result.lastIndexOf(",")));
            } else {
                System.out.println("请求失败！");
            }
            content.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
