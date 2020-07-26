package com.zc;

import com.zc.dao.CustomersDao;
import com.zc.entity.Customers;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 周超
 * @since 2020/5/17 12:34
 */
public class MybatisTest {
	public static void main(String[] args) throws IOException {
		InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resource);
		SqlSession sqlSession = factory.openSession();
		final CustomersDao mapper = sqlSession.getMapper(CustomersDao.class);
		final List<Customers> customers = mapper.queryAllByLimit(0, 10);
		customers.forEach(System.out::println);
		sqlSession.close();
	}
}
