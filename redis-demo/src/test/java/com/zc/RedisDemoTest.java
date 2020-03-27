package com.zc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 周超
 * @since 2020-03-27 17:30
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisDemoTest {
	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	public void testRedis() {
		System.out.println(redisTemplate.opsForValue());
	}

}