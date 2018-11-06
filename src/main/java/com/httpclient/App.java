package com.httpclient;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        //请求链接，接口地址
        String url="http://192.168.241.129:8080/login.do";
        //get请求或post请求
        url+="?name=cx&password=123456";
        //封装请求
        HttpGet get=new HttpGet(url);
        //创建一个客户端
        HttpClient httpClient= HttpClients.createDefault();
        //响应--》》把返回的数据提取出来
        HttpResponse response = httpClient.execute(get);
        //数据返回值转换String输出
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
    }
}
