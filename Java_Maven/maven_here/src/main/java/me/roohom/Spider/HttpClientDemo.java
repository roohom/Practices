package me.roohom.Spider;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: HttpClient
 * Author: Roohom
 * Function:
 * Date: 2020/8/9 16:44
 * Software: IntelliJ IDEA
 */
public class HttpClientDemo {
    @Test
    public void testHtppPost() {
        //初始化URL
        String url = "http://www.itcast.cn";
        //创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //穿件httpPost对象，用于发送post请求

        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.105 Safari/537.36");
        /********************POST请求添加参数*************************/
        List<BasicNameValuePair> list = new ArrayList();
        list.add(new BasicNameValuePair("username", "zs"));
        list.add(new BasicNameValuePair("userpwd", "123123"));
        list.add(new BasicNameValuePair("useremail", "jackma@alibaba.com"));
        //创建一个请求实体对象(对象中存放了发送给服务器的数据)
        HttpEntity httpEntity = null;
        try {
            httpEntity = new UrlEncodedFormEntity(list);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        httpPost.setEntity(httpEntity);

        /***********************************************************/
        try {
            //使用httpClient发送post请求
            CloseableHttpResponse response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            InputStream content = entity.getContent();
            int len = -1;
            byte[] buf = new byte[1024];
            while ((len = content.read(buf)) != -1) {
                String str = new String(buf, 0, len);
                System.out.println(str);
            }
            content.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取响应数据
        //关闭资源
    }

    @Test
    public void testHttpGet() {
        //初始化URL
        String url = "https://fanyi.baidu.com/";
        //创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //使用httpclient对象进行get请求
        //创建一个get请求对象
        HttpGet httpGet = new HttpGet(url);

        //设置请求头部信息
        httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.105 Safari/537.36");

        //向服务器发送请求
        try {
            CloseableHttpResponse rsp = httpClient.execute(httpGet);

            if (rsp.getStatusLine().getStatusCode() == 200) {
                System.out.println("请求成功了！");
                //下面的操作应该包含在本if语句里
            }
            //接收相应的数据
            HttpEntity entity = rsp.getEntity();
            //如果响应的是非文本数据就应该使用字节流
            //如果接收的是文本类型，可以直接使用:工具类EntityUtils
//            String html = EntityUtils.toString(entity,"utf8");
//            System.out.println(html);
            InputStream content = entity.getContent();
            int len = -1;
            byte[] buf = new byte[1024];
            while ((len = content.read(buf)) != -1) {
                String str = new String(buf, 0, len);
                System.out.println(str);
            }
            content.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
