package com.mphasis.storeapp.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class MySQLDBConfig {
	
	@Autowired
	private Environment environment;

	@Bean(name = {"ds"})
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("driverName"));
		dataSource.setUrl(environment.getRequiredProperty("url"));
		dataSource.setUsername("root");
		dataSource.setPassword(environment.getRequiredProperty("password"));
		return dataSource;
	}
	
	@Bean(name = {"mysqSessionFactory"}) // we are working with Hibernate so we require session factory
	public LocalSessionFactoryBean getSessionFactory(@Autowired @Qualifier("ds") DataSource datasource)
	{
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(datasource);
		sessionFactoryBean.setPackagesToScan("com.mphasis.domain");//scan and look for all entity classes 
		sessionFactoryBean.setHibernateProperties(hibernateProperties()); // here parameter requires object of properties
		return sessionFactoryBean;
	}
	
	private Properties hibernateProperties() // To specify Hibernate specific properties
	{
		//these have hibernate specific keys
		Properties properties = new Properties(); // child of map
		properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
		properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
		return properties;
	}
	
	@Bean(name = {"hibernateTransactionManager"})
	public HibernateTransactionManager getHibernateTransactionManager(@Autowired @Qualifier("mysqSessionFactory") 
	      SessionFactory sessionFactory)
	{
		HibernateTransactionManager hm = new HibernateTransactionManager(sessionFactory);
		return hm;
	}

}


    