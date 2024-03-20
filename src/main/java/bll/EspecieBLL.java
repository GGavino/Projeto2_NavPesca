package bll;

import entity.EspecieEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class EspecieBLL {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = factory.createEntityManager();
    private static EntityTransaction transaction = em.getTransaction();

    public static void criar(EspecieEntity especie){
        transaction.begin();
        em.persist(especie);
        transaction.commit();
    }

    public static void apagar(EspecieEntity especie){
        transaction.begin();
        em.remove(especie);
        transaction.commit();
    }

    public static void update(){
        transaction.begin();
        transaction.commit();
    }

    public static EspecieEntity findEspecie(long id){ return em.find(EspecieEntity.class, id); }

    public static List<EspecieEntity> listar(){
        return em.createQuery("from EspecieEntity ").getResultList();
    }

}
