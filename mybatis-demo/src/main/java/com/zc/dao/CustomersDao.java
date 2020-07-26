package com.zc.dao;

import com.zc.entity.Customers;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Customers)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-24 21:52:57
 */
public interface CustomersDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param customernumber 主键
	 * @return 实例对象
	 */
	Customers queryById(Integer customernumber);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<Customers> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param customers 实例对象
	 * @return 对象列表
	 */
	List<Customers> queryAll(Customers customers);

	/**
	 * 新增数据
	 *
	 * @param customers 实例对象
	 * @return 影响行数
	 */
	int insert(Customers customers);

	/**
	 * 修改数据
	 *
	 * @param customers 实例对象
	 * @return 影响行数
	 */
	int update(Customers customers);

	/**
	 * 通过主键删除数据
	 *
	 * @param customernumber 主键
	 * @return 影响行数
	 */
	int deleteById(Integer customernumber);

}