/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testspring.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

/**
 *
 * @author Lakshitha
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
      @Autowired
    DataSource dataSource;
      @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/login").permitAll().anyRequest().authenticated().and()
//                .formLogin().loginPage("/login");
  
         http.authorizeRequests().antMatchers("/external/**", "/login").permitAll().anyRequest().authenticated().and()
                .formLogin().loginPage("/login").and()
                .logout().logoutSuccessUrl("/").and().csrf().disable();

//http
//            .authorizeRequests()
//                .anyRequest().authenticated()
//                .and()
//            .formLogin()
//                .loginPage("/login");
                
    }
    
       @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
           System.out.println(">><<");
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery(
                        "select username, password, true from Employee where username=?")
                .authoritiesByUsernameQuery(
                        "select username, type from Employee where username=?");
    }
}
