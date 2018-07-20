package com.qfedu.jedis;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 *@Author feri
 *@Date Created in 2018/7/20 09:55
 */
public class Jedis_Main1 {
    public static void main(String[] args) {
        //1、创建Jedis对象
        Jedis jedis=new Jedis("10.8.155.38",6379);
        //2、认证密码
        jedis.auth("student");
        //3、连接
        jedis.connect();
        //4、使用
        Set<String> keys=jedis.keys("*");
        System.out.println("keys:"+keys);
        //
        System.out.println("set:"+jedis.set("str1","困了"));
        System.out.println("get:"+jedis.get("str1"));
        jedis.expire("str1",30);
        System.out.println("ttl:"+jedis.ttl("str1"));

        //5、断开连接
        jedis.disconnect();


    }
}
