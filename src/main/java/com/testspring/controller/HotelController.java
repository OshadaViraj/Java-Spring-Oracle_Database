/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testspring.controller;

import com.testspring.entity.Hotels;
import com.testspring.repository.HotelDataAccess;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 *
 * @author Oshada
 */
@Controller
@RequestMapping(value = "/Hotel")
public class HotelController {
    
    @Autowired
    protected HotelDataAccess hotelDataAccess;
   
    
    @RequestMapping(value = "add", method = GET)
    public String add()
    {
         
     return "newHotel";
    }
    
     @RequestMapping(value = "add", method = POST)
    public String addHotel(Hotels hotel)
    {
        hotelDataAccess.create(hotel);
     return "redirect:/Hotel/viewAll";
    }
    
    
     @RequestMapping(value = "viewAll", method = GET)
    public String viewAll(HttpServletRequest request, Map model) {
        List<Hotels> hotels = hotelDataAccess.findAll();
         System.out.println(">>> Hotel Size"+hotels.size());
        model.put("hotels", hotels);
        
         return "viewAllHotels";
    } 
    
    @RequestMapping(value = "find", method = GET)
    public String find(Hotels hotel,Map model)
    {
         hotel=hotelDataAccess.findHotelByCode(hotel.getCode());
         
         model.put("hotel", hotel);
     return "info";
    }
        
      @RequestMapping(value = "check", method = GET, produces = "application/json")
    public String checkCode(String id)
    {
        Hotels hotel=new Hotels();
        hotel=hotelDataAccess.findHotelByCode(id);
        
      return hotel.getCode();
    }
    
     @RequestMapping(value = "edit", method = POST)
    public String edit(Hotels hotel)
    {
       hotelDataAccess.edit(hotel);
       return "redirect:/Hotel/viewAll";
    }
     @RequestMapping(value = "delete", method = POST)
    public String delete(Hotels hotel)
    {
       hotelDataAccess.remove(hotel);
      return "redirect:/Hotel/viewAll";
    }
    
}
