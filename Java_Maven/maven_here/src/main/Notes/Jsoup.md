# Jsoup

在java爬虫中，通常使用HttpClient来发送请求，接收响应数据
当获取到响应的数据(通常是一个html页面)，通常使用jsoup进行解析


- jsoup的主要功能如下：
    - 1. 从一个URL，文件或字符串中**解析HTML**；
    - 2. 使用DOM或CSS选择器来查找、取出数据；
    - 3. 可操作HTML元素、属性、文本；
- 如何解析HTML:
    - 从字符串中解析HTML
        - 字符串是从HttpClient发送请求而接收响应
            - String html = EntityUtils.toString(httpEntity)
    - 使用document对象来从HTML中查找所需要的的元素对象
    - 利用元素兑现来操作文本、属性