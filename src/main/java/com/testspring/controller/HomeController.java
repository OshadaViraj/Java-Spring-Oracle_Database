/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testspring.controller;


import com.testspring.entity.Hotels;
import com.testspring.repository.HotelDataAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 *
 * @author Lakshitha
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    
    
     
    
    
    @RequestMapping(method = GET)
    public String home() {
      
        return "base";
    }
}
