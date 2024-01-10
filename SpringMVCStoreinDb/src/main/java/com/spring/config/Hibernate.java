package com.spring.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:db.property")
@ComponentScan(basePackages = {"com.spring.bean,com.spring.controller,com.spring.repository,com.spring.service"})
public class Hibernate {
	@Autowired
	private Environment environment;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setDriverClassName(environment.getRequiredProperty("driverClass"));
		data.setUrl(environment.getRequiredProperty("url"));
		data.setUsername(environment.getRequiredProperty("uname"));
		data.setPassword(environment.getRequiredProperty("password"));
		return data;
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", environment.getRequiredProperty("dialect"));
		properties.put("hibernate.show_sql", environment.getRequiredProperty("show_sql"));
		properties.put("hibernate.format_sql", environment.getRequiredProperty("format_sql"));
		properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hbm2ddl.auto"));
		return properties;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sesionFactory = new LocalSessionFactoryBean();
		sesionFactory.setDataSource(dataSource());
		sesionFactory.setPackagesToScan(new String[] { "com.spring.entity" });
		sesionFactory.setHibernateProperties(hibernateProperties());
		return sesionFactory;
	}

	@Bean
	public HibernateTemplate hibernateTemplate() {
		HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory().getObject());
		return hibernateTemplate;
	}

	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;

	}
}
