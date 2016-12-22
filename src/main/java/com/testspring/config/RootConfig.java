/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testspring.config;

import com.testspring.repository.HotelDataAccess;
import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author Lakshitha
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.testspring"},
        excludeFilters = {
            @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {
    
      @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource,
            JpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
        emfb.setDataSource(dataSource);
        emfb.setJpaVendorAdapter(jpaVendorAdapter);
        emfb.setJpaProperties(getHibernateProperties());
        emfb.setPackagesToScan("com.testspring.entity");
        return emfb;
    }
    
    
      @Bean
    public Properties getHibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.transaction.jta.platform", "org.hibernate.service.jta.platform.internal.SunOneJtaPlatform");
        properties.put("hibernate.enable_lazy_load_no_trans", "true");
        properties.put("javax.persistence.schema-generation.database.action", "none");
        return properties;
    }
    
     @Bean
    public DataSource dataSource() {
        System.out.println("DataSource :: init");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        dataSource.setUsername("itos");
        dataSource.setPassword("itos");
        return dataSource;
    }
    
     @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.ORACLE);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(true);
        adapter.setDatabasePlatform("org.hibernate.dialect.Oracle10gDialect");
        return adapter;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                entityManagerFactory(dataSource(), jpaVendorAdapter()).getObject());
        return transactionManager;
    }

    @Bean
    public PersistenceAnnotationBeanPostProcessor persistenceAnnotationBeanProcessor() {
        return new PersistenceAnnotationBeanPostProcessor();
    }
    
    
    @Bean
    public HotelDataAccess hotelDataAccess()
    {
        
     return new HotelDataAccess();
        
    }


    
}
