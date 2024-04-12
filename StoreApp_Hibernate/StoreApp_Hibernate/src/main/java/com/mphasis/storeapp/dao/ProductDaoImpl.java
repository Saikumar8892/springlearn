package com.mphasis.storeapp.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mphasis.domain.Product;

import org.hibernate.Criteria;
import  org.hibernate.Session;

@Component("productDao")
public class ProductDaoImpl implements ProductDAO
{
	@Autowired
	@Qualifier("mysqSessionFactory")
    private SessionFactory sessionFactory;
    
    @Transactional
	public int insert(Product product) {
		
		//getCurrentSession() will take care of open and close the session
		//Return type of save is Serializable we will cast it to int
		//Here based on the dialect they will use insert commands specific to mysql
		return (Integer) sessionFactory.getCurrentSession().save(product); // Queries not required 
	}

	@Transactional
	public void update(Product product) {
	    sessionFactory.getCurrentSession().saveOrUpdate(product);
	}
	
    @Transactional(readOnly = true) // we dont do commit and rollback
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		//For get all products no functions in session
		Session session = sessionFactory.getCurrentSession();  
		Criteria criteria =  session.createCriteria(Product.class);
		return (List<Product>)criteria.list();
	}

    @Transactional
	public int delete(int id) {
		/*
	    Session session = sessionFactory.getCurrentSession();
	    Here delete methods accept Object as Parameter, So first we need to fetch person details and then perform delete
	    Product product = session.get(Product.class, id);// get product details of id given
	    session.delete(product);  //
	    return 0;
	    In this we do first select and then delete so 2 sql statement is fired , so we don't use delete functionality
	    */
		
		 Session session = sessionFactory.getCurrentSession();
		 Query query = session.createSQLQuery("delete from product_details where id = :identifier");
		 query.setInteger("identifier", id); // After colon what we write
		 return query.executeUpdate(); // Directly firing delete query
	      
	}

    @Transactional(readOnly = true) 
	public Product getProductById(int id) {
	    /*
	    This is Using Session
		Session session = sessionFactory.getCurrentSession();
	    Product product = session.get(Product.class, id);
	    */
		
		 // This is Using HQL
		 Session session = sessionFactory.getCurrentSession();
		 //In HQL we dont write tabel name we write class name
		 Query query = session.createQuery("from com.mphasis.domain.Product p where p.id = :identifier");
		 query.setParameter("identifier", id); 
		 return (Product) query.uniqueResult();  // We get only one Object
	}
}
