package bll;

import entity.NacionalidadeEntity;
import entity.TripulanteEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class TripulanteBLL {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = factory.createEntityManager();
    private static EntityTransaction transaction = em.getTransaction();

    public static void criar(TripulanteEntity tri){
        transaction.begin();
        em.persist(tri);
        transaction.commit();
    }

    public static void apagar(TripulanteEntity tri){
        transaction.begin();
        em.remove(tri);
        transaction.commit();
    }

    public static TripulanteEntity findTripulante(long id){
        return em.find(TripulanteEntity.class, id);
    }

    public static List<TripulanteEntity> listar(){
        return em.createQuery("from TripulanteEntity").getResultList();
    }
}
