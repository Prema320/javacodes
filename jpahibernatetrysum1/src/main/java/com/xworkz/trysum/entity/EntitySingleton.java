package com.xworkz.trysum.entity;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntitySingleton {
    private static EntityManagerFactory factory=null;

    public static EntityManagerFactory getFactory(){
        return factory;
    }
    static
    {
        factory=Persistence.createEntityManagerFactory("com.xworkz");
    }
}
