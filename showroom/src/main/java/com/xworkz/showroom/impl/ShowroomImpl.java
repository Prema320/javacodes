package com.xworkz.showroom.impl;

import com.xworkz.showroom.dto.GiriasDto;
import com.xworkz.showroom.inter.Showroom;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShowroomImpl implements Showroom {
    @Override
    public void addAllDetails(GiriasDto dto) {
        Persistence persistence=new Persistence();
        EntityManagerFactory entityManagerFactory=persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
//        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
    }
}
