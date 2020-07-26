package com.zc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 周超
 * @since 2020-03-27 17:30
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisDemoTest {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Test
	public void testRedis() {
		System.out.println(stringRedisTemplate.opsForValue().get("name"));
	}

	@Test
	public void test() {
		final String s = "hello world";
		System.out.println(s.length());
	}

}