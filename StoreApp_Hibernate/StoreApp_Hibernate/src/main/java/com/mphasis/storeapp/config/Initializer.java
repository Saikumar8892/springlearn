package com.mphasis.storeapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ComponentScan(basePackages = {"com.mphasis.storeapp.config","com.mphasis.storeapp.dao"})
@PropertySource(value = {"classpath:application.properties"}) // properties files will be read and after reading key value
// object of environment will be created and that object will be filled with key and value
public class Initializer {

}
