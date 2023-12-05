package com.xworkz.servlet.repo.impl;

import com.xworkz.servlet.dto.CustomerDto;
import com.xworkz.servlet.dto.UserDto;
import com.xworkz.servlet.entity.EntitySingleton;
import com.xworkz.servlet.repo.UserRepo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class UserRepoImpl implements UserRepo {
    @Override
    public boolean add(UserDto dto) {
        boolean isAdded=false;
        EntityManager entityManager= EntitySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
        isAdded=true;
        return isAdded;
    }

    @Override
    public boolean addAll(CustomerDto dto) {
        boolean isAdded=false;
        EntityManager entityManager= EntitySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
        isAdded=true;
        return isAdded;

    }

    @Override
    public List<UserDto> getAll() {
        EntityManager entityManager=EntitySingleton.getFactory().createEntityManager();
        Query query= entityManager.createNamedQuery("get");
        return query.getResultList();
    }

    @Override
    public UserDto getUserById(int id) {

            EntityManager entityManager=EntitySingleton.getFactory().createEntityManager();
            Query query=entityManager.createNamedQuery("getById").setParameter("id" , id);
            return (UserDto) query.getSingleResult();
        }




    @Override
    public boolean deleteById(int id) {

        EntityManager entityManager = EntitySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createNamedQuery("deleteById").setParameter("ids",id).executeUpdate();
        entityManager.getTransaction().commit();

        return true;
    }

    public boolean updateInfoById(int id, UserDto updatedDto) {
        EntityManager entityManager = EntitySingleton.getFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        UserDto user = entityManager.find(UserDto.class, id);
        user.setName(updatedDto.getName());
        user.setMobileNo(updatedDto.getMobileNo());
        user.setEmail(updatedDto.getEmail());
        user.setComments(updatedDto.getComments());
        entityManager.merge(user);
        transaction.commit();
        return false;


    }

}
