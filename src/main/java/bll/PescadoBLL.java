package bll;

import entity.PescadoEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class PescadoBLL {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = factory.createEntityManager();
    private static EntityTransaction transaction = em.getTransaction();

    public static void criar(PescadoEntity pescado){
        transaction.begin();
        em.persist(pescado);
        transaction.commit();
    }

    public static void apagar(PescadoEntity pescado){
        transaction.begin();
        em.remove(pescado);
        transaction.commit();
    }

    public static void update(){
        transaction.begin();
        transaction.commit();
    }

    public static PescadoEntity findPescado(long id){ return em.find(PescadoEntity.class, id); }

    public static List<PescadoEntity> listar(){
        return em.createQuery("from PescadoEntity ").getResultList();
    }

}


