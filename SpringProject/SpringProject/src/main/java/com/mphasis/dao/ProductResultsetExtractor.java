package com.mphasis.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.mphasis.domain.Product;

public class ProductResultsetExtractor implements ResultSetExtractor<Product>
{
	public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
		if(rs.next())
		{
			Product product = new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setPrice(rs.getDouble(3));
			product.setManufacturingDate(rs.getDate(4).toLocalDate());
			return product;
		}
		return null;
	}
}
