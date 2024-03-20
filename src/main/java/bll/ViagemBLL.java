package bll;

import entity.ViagemEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class ViagemBLL {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = factory.createEntityManager();
    private static EntityTransaction transaction = em.getTransaction();

    public static void criar(ViagemEntity viagem){
        transaction.begin();
        em.persist(viagem);
        transaction.commit();
    }

    public static void apagar(ViagemEntity viagem){
        transaction.begin();
        em.remove(viagem);
        transaction.commit();
    }
    public static void update(){
        transaction.begin();
        transaction.commit();
    }

    public static ViagemEntity findViagem(long id){
        return em.find(ViagemEntity.class, id);
    }

    public static List<ViagemEntity> listar(){
        return em.createQuery("from ViagemEntity ").getResultList();
    }

}