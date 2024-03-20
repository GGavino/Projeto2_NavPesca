package bll;

import entity.RecursosHumanosEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class RecursosHumanosBLL {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = factory.createEntityManager();
    private static EntityTransaction transaction = em.getTransaction();

    public static void criar(RecursosHumanosEntity rh){
        transaction.begin();
        em.persist(rh);
        transaction.commit();
    }

    public static void apagar(RecursosHumanosEntity rh){
        transaction.begin();
        em.remove(rh);
        transaction.commit();
    }

    public static void update(){
        transaction.begin();
        transaction.commit();
    }

    public static RecursosHumanosEntity findRH(long id){ return em.find(RecursosHumanosEntity.class, id); }

    public static List<RecursosHumanosEntity> listar(){
        return em.createQuery("from RecursosHumanosEntity ").getResultList();
    }

}
