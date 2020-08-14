package me.roohom;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * ClassName: TestHttpClient
 * Author: Roohom
 * Function:
 * Date: 2020/8/9 11:49
 * Software: IntelliJ IDEA
 */
public class TestHttpClient {
    public static void main(String[] args) throws Exception {
        //1. 确定首页url
        String indexUrl = "http://www.itcast.cn";

        //2. 发送请求 获取数据
        //2.1: 创建HttpClient对象: 理解为这个对象就是一个 浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault(); // 固定写法

        //2.2: 创建 请求方式的对象: 请求对象
        HttpGet httpGet = new HttpGet(indexUrl);

        //2.3: 设置请求对象: 设置请求头
        httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36");

        //2.4: 发送请求, 获取响应对象
        CloseableHttpResponse response = httpClient.execute(httpGet);

        //2.5: 从响应对象中获取数据
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("状态码:" + statusCode);

        if (statusCode == 200) { // 请求成功了
            // 获取响应头
            Header[] headers = response.getHeaders("Content-Type");
            for (Header header : headers) {
                String value = header.getValue();
                System.out.println(value);
            }

            // 获取响应体
            HttpEntity httpEntity = response.getEntity();//获取HttpEntity对象(响应体对象)

            // 如果获取：图片、视频、声音 , 必须使用字节输入流。 如果是文本,此处不需要这样获取
            //InputStream inputstream = httpEntity.getContent();

            // 如果返回的是文本, 使用以下方式直接获取
            String html = EntityUtils.toString(httpEntity, "GBK");
            System.out.println(html);
        }
        //2.6: 释放资源
        httpClient.close();
    }
}
