package com.xworkz.trysum.repo.impl;

import com.xworkz.trysum.dto.UserDto;
import com.xworkz.trysum.entity.EntitySingleton;
import com.xworkz.trysum.repo.UserRepo;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class UserRepoImpl implements UserRepo {
    @Override
    public boolean addAll(UserDto dto) {
        EntityManager entityManager= EntitySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
        return false;
    }

    @Override
    public List<UserDto> getAll() {
        EntityManager entityManager=EntitySingleton.getFactory().createEntityManager();
        Query query= entityManager.createNamedQuery("getAll");
        return query.getResultList();
    }

    @Override
    public UserDto getUserDtoById(int id) {
        EntityManager entityManager=EntitySingleton.getFactory().createEntityManager();
        Query query=entityManager.createNamedQuery("getUserDtoById").setParameter("ids",id);
        return (UserDto) query.getSingleResult();
    }

    @Override
    public String getNameByEmail(String email) {
        EntityManager entityManager=EntitySingleton.getFactory().createEntityManager();
        Query query=entityManager.createNamedQuery("getNameByEmail").setParameter("email",email);
        return (String) query.getSingleResult();
    }

    @Override
    public void updateEmailById(String updatedEmail, int id) {
        EntityManager entityManager=EntitySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Query query=entityManager.createNamedQuery("updateEmailById").setParameter("idq",id).setParameter("mail",updatedEmail);
        query.executeUpdate();
        entityManager.getTransaction().commit();

    }

    @Override
    public UserDto updateUserDtoById(int id,UserDto dto) {
        EntityManager entityManager=EntitySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        UserDto dto1=entityManager.find(UserDto.class,id);
        dto1.setName(dto.getName());
        dto1.setMobileNo(dto.getMobileNo());
        dto1.setEmail(dto.getEmail());
        dto1.setAddress(dto.getAddress());
        entityManager.getTransaction().commit();
        return null;

    }

    @Override
    public void deleteUserDtoById(int id) {
        EntityManager entityManager=EntitySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Query query=entityManager.createNamedQuery("deleteUserDtoById").setParameter("id",id);
        query.executeUpdate();
        entityManager.getTransaction().commit();

    }
}
