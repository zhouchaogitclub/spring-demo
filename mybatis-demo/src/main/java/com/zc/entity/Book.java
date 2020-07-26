package com.zc.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Book)实体类
 *
 * @author makejava
 * @since 2020-05-17 09:47:03
 */
@Data
public class Book implements Serializable {
	private static final long serialVersionUID = -39423006989911535L;
	private Integer id;
	private String name;
	private String author;
}