package bll;

import entity.BarcoEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class BarcoBLL {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = factory.createEntityManager();
    private static EntityTransaction transaction = em.getTransaction();

    public static void criar(BarcoEntity barco){
        transaction.begin();
        em.persist(barco);
        transaction.commit();
    }

    public static void apagar(BarcoEntity barco){
        transaction.begin();
        em.remove(barco);
        transaction.commit();
    }
    public static void update(){
        transaction.begin();
        transaction.commit();
    }

    public static BarcoEntity findBarco(long id){
        return em.find(BarcoEntity.class, id);
    }

    public static List<BarcoEntity> listar(){
        return em.createQuery("from BarcoEntity ").getResultList();
    }

}
