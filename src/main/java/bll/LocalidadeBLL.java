package bll;

import entity.LocalidadeEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class LocalidadeBLL {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = factory.createEntityManager();
    private static EntityTransaction transaction = em.getTransaction();

    public static void criar(LocalidadeEntity local){
        transaction.begin();
        em.persist(local);
        transaction.commit();
    }

    public static void apagar(LocalidadeEntity local){
        transaction.begin();
        em.remove(local);
        transaction.commit();
    }

    public static void update(){
        transaction.begin();
        transaction.commit();
    }

    public static LocalidadeEntity findLocalidade(String id){ return em.find(LocalidadeEntity.class, id); }

    public static List<LocalidadeEntity> listar(){
        return em.createQuery("from LocalidadeEntity ").getResultList();
    }

}

