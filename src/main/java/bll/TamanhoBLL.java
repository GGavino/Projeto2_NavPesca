package bll;

import entity.TamanhoEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class TamanhoBLL {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = factory.createEntityManager();
    private static EntityTransaction transaction = em.getTransaction();

    public static void criar(TamanhoEntity tamanhho){
        transaction.begin();
        em.persist(tamanhho);
        transaction.commit();
    }

    public static void apagar(TamanhoEntity tamanhho){
        transaction.begin();
        em.remove(tamanhho);
        transaction.commit();
    }

    public static void update(){
        transaction.begin();
        transaction.commit();
    }

    public static TamanhoEntity findTamanho(long id){ return em.find(TamanhoEntity.class, id); }

    public static List<TamanhoEntity> listar(){
        return em.createQuery("from TamanhoEntity ").getResultList();
    }

}
