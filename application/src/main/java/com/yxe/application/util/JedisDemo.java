package com.yxe.application.util;
import redis.clients.jedis.Jedis;
/**
 * @author Evan
 */
public class JedisDemo {
    public static void main(String[] args) {
        // 构造jedis对象
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        // 向redis中添加数据
        jedis.set("myname", "yxe");
        // 从redis中读取数据
        String value = jedis.get("myname");
        System.out.println(value);
        // 关闭连接
        jedis.close();
    }
}

//运行之后查看redis中的值：
//127.0.0.1:6379> keys *
//1) "name"
