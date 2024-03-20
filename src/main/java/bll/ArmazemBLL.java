package bll;

import entity.ArmazemEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class ArmazemBLL {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = factory.createEntityManager();
    private static EntityTransaction transaction = em.getTransaction();

    public static void criar(ArmazemEntity armazem){
        transaction.begin();
        em.persist(armazem);
        transaction.commit();
    }

    public static void apagar(ArmazemEntity armazem){
        transaction.begin();
        em.remove(armazem);
        transaction.commit();
    }

    public static void update(){
        transaction.begin();
        transaction.commit();
    }

    public static ArmazemEntity findArmazem(long id){
        return em.find(ArmazemEntity.class, id);
    }

    public static List<ArmazemEntity> listar(){
        return em.createQuery("from ArmazemEntity ").getResultList();
    }
}

