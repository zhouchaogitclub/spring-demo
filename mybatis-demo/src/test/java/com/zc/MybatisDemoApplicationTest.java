package com.zc;

import com.zc.dao.CustomersDao;
import com.zc.entity.Customers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 周超
 * @since 2020/7/25 19:19
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisDemoApplicationTest {
	@Resource
	private CustomersDao customersDao;

	@Test
	public void testCustomerDao() {
		final List<Customers> customers = customersDao.queryAllByLimit(0, 10);
		customers.forEach(System.out::println);
	}
}