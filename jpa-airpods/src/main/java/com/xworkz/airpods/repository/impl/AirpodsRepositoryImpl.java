package com.xworkz.airpods.repository.impl;

import com.xworkz.airpods.dto.AirpodsDto;
import com.xworkz.airpods.repository.AirpodsRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class AirpodsRepositoryImpl implements AirpodsRepository {
    //AirpodsDto dto = new AirpodsDto(0, null, 0, null, 0);


    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
    EntityManager em = emf.createEntityManager();


    @Override
    public boolean store(AirpodsDto dto) {

        if(em!=null) {

            em.getTransaction().begin();
            em.persist(dto);
            em.getTransaction().commit();
            em.close();
            return true;
        }

        return false;

    }

    @Override
    public boolean updateColorByName(String color, String name) {
        if(em!=null) {
            em.getTransaction().begin();
            Query query = (Query) em.createNamedQuery("updateColorbyName");

            query.setParameter("col",color);
            query.setParameter("nm", name);
            query.executeUpdate();
            em.getTransaction().commit();
            return true;

        }
        return false;
    }

    @Override
    public boolean deleteByPrice(int price) {
        if(em!=null) {
            em.getTransaction().begin();
            Query query = em.createNamedQuery("deleteByPrice");
            query.setParameter("pr", price).executeUpdate();

            em.getTransaction().commit();
            return true;

        }
        return false;
    }

    @Override
    public List<AirpodsDto> readAll() {
        em.getTransaction().begin();
        Query query = em.createNamedQuery("select");
        return query.getResultList();

    }

}
