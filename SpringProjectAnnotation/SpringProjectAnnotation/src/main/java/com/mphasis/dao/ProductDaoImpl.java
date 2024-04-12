package com.mphasis.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import com.mphasis.domain.Product;

@Component(value = "productDaoImpl")
public class ProductDaoImpl implements ProductDAO
{
	@Autowired
	@Qualifier("jdbcTemplate")  
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Product product) 
	{
		//Prepared Statement
		return jdbcTemplate.update("INSERT INTO PRODUCT_DETAILS VALUES (?,?,?,?)",
				product.getId(),
				product.getName(),
				product.getPrice(),
				Date.valueOf(product.getManufacturingDate()));
	}

	public int update(Product product) {
		//Statement Object
		String sql = "Update product_details set name='"+product.getName()+"',"
				+ "price='"+product.getPrice()
				+"',manufacturing_date='"+Date.valueOf(product.getManufacturingDate())+"' where id="+product.getId();
		return jdbcTemplate.update(sql);
	}
	
	public int delete(final int id)
	{
		return jdbcTemplate.update("delete from product_details where id = ?",new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, id);
			}
		});
	}
	
	public List<Product> getAllProducts()
	{
		return jdbcTemplate.query("select * from product_details", new ProductRowMapper());
	}

	public Product getProductById(int id) {
		return jdbcTemplate.query("select * from product_details where id=?",
				new Object[] {id},
				new ProductResultsetExtractor());
	}
}

