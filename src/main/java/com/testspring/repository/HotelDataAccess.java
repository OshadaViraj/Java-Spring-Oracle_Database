/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testspring.repository;

import com.testspring.entity.Hotels;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Oshada
 */
@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class HotelDataAccess {
    
      @PersistenceContext
    protected EntityManager em;
      public void create(Hotels instance)
      {
        em.persist(instance);
      }
      
      public Hotels findHotelByCode(String code)
      {
       return em.find(Hotels.class, code);
      }
      
      public List<Hotels> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Hotels> cq = cb.createQuery(Hotels.class);
        TypedQuery<Hotels> result = em.createQuery(cq.select(cq.from(Hotels.class)));
        return result.getResultList();
    }
      
      public void edit(Hotels hotel)
      {
       em.merge(hotel);
      }
      
      public void remove(Hotels hotel)
      {
          hotel =findHotelByCode(hotel.getCode());
       em.remove(hotel);
      }
    
}
