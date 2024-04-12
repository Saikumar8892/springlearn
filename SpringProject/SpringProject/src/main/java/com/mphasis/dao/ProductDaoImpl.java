package com.mphasis.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.mphasis.domain.Product;

public class ProductDaoImpl implements ProductDAO
{
	private JdbcTemplate jdbcTemplate; // reference of jdbc template
	
	public ProductDaoImpl(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(Product product) 
	{
		//Using Prepared Statement
		return jdbcTemplate.update("INSERT INTO PRODUCT_DETAILS VALUES (?,?,?,?)", // This update inserts
				product.getId(), // 1st ?
				product.getName(), // 2nd ?
				product.getPrice(), //3rd?
				//here we are converting local date to java.sql.Date
				Date.valueOf(product.getManufacturingDate())); //4th ?
	}
	
	public int update(Product product) {
		//Using Statement Object
		String sql = "Update product_details set name='"+product.getName()+"',"
				+ "price='"+product.getPrice()
				+"',manufacturing_date='"+Date.valueOf(product.getManufacturingDate())+"' where id="+product.getId();
		return jdbcTemplate.update(sql); // This update updates the value which is a single string
	}
	
	public int delete(final int id)
	{
		// here directly we are returning before return they are closing the connection
		return jdbcTemplate.update("delete from product_details where id = ?",new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, id);
			}
		});
	}
	
	public List<Product> getAllProducts()
	{
		return jdbcTemplate.query("select * from product_details", new ProductRowMapper()); // return list of product
	}


	public Product getProductById(int id) 
	{
		//Using Prepared Statement when id=? 
		return jdbcTemplate.query("select * from product_details where id=?", new Object[] {id},
				new ProductResultsetExtractor());
	}
	
}

