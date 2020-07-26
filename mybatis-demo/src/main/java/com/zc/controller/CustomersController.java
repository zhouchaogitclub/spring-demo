package com.zc.controller;

import com.zc.dao.CustomersDao;
import com.zc.entity.Customers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 周超
 * @since 2020/7/25 20:08
 */
@RestController
@RequestMapping("customer")
public class CustomersController {
	@Resource
	private CustomersDao customersDao;

	@GetMapping("get/{id}")
	public Customers getCustomerById(@PathVariable Integer id) {
		return customersDao.queryById(id);
	}
}
