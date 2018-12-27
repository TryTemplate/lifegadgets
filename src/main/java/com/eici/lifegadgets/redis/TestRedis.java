package com.eici.lifegadgets.redis;

import com.eici.lifegadgets.dto.Author;
import com.eici.lifegadgets.redis.RedisHelperImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisHelperImpl redisHelper;

    @Test
    public void test() throws Exception {
//        基本写法
//        stringRedisTemplate.opsForValue().set("aaa","111");
//        Assert.assertEquals("111",stringRedisTemplate.opsForValue().get("aaa"));
//        System.out.println(stringRedisTemplate.opsForValue().get("aaa"));
        Author user = new Author();
        user.setName("Alex");
        user.setIntro_l("不会打篮球的程序不是好男人");
        redisHelper.valuePut("aaa", user);
        System.out.println(redisHelper.getValue("aaa"));
    }

    @Test
    public void testObj() throws Exception {
        Author user = new Author();
        user.setName("Jerry");
        user.setIntro_l("不会打篮球的程序不是好男人!");

        ValueOperations<String, Author> operations = redisTemplate.opsForValue();
        operations.set("502", user);
        Thread.sleep(500);
        boolean exists = redisTemplate.hasKey("502");
        if (exists) {
            System.out.println(redisTemplate.opsForValue().get("502"));
        } else {
            System.out.println("exists is false");
        }
        // Assert.assertEquals("aa", operations.get("com.neo.f").getUserName());
    }
}
