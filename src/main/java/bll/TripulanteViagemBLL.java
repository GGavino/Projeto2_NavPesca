package bll;

import entity.TripulanteViagemEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class TripulanteViagemBLL {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = factory.createEntityManager();
    private static EntityTransaction transaction = em.getTransaction();

    public static void criar(TripulanteViagemEntity tripViag){
        transaction.begin();
        em.persist(tripViag);
        transaction.commit();
    }

    public static void apagar(TripulanteViagemEntity tripViag){
        transaction.begin();
        em.remove(tripViag);
        transaction.commit();
    }

    public static void update(){
        transaction.begin();
        transaction.commit();
    }

    public static List<TripulanteViagemEntity> listar(){
        return em.createQuery("from TripulanteViagemEntity").getResultList();
    }
}

