package bll;

import entity.GestorEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class GestorBLL {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = factory.createEntityManager();
    private static EntityTransaction transaction = em.getTransaction();

    public static void criar(GestorEntity gestor){
        transaction.begin();
        em.persist(gestor);
        transaction.commit();
    }

    public static void apagar(GestorEntity gestor){
        transaction.begin();
        em.remove(gestor);
        transaction.commit();
    }

    public static void update(){
        transaction.begin();
        transaction.commit();
    }

    public static GestorEntity findGestor(long id){
        return em.find(GestorEntity.class, id);
    }

    public static List<GestorEntity> listar(){
        return em.createQuery("from GestorEntity ").getResultList();
    }
}
