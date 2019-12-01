package com.yxe.application.service;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void setStr(String key, String value) {
        setStr(key, value, null);
    }

    public void setStr(String key, String value, Long time) {
        stringRedisTemplate.opsForValue().set(key, value);
        if (time != null) {
            stringRedisTemplate.expire(key, time, TimeUnit.SECONDS);
        }
    }

    public Object getKey(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    public void delKey(String key) {
        stringRedisTemplate.delete(key);
    }
}
