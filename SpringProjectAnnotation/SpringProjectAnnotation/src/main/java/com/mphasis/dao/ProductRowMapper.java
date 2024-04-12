package com.mphasis.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mphasis.domain.Product;

public class ProductRowMapper implements RowMapper<Product>
{

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setId(rs.getInt(1));
		product.setName(rs.getString(2));
		product.setPrice(rs.getDouble(3));
		product.setManufacturingDate(rs.getDate(4).toLocalDate());
		return product;
	}
  
}
