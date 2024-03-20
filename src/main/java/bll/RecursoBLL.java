package bll;

import entity.RecursoEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class RecursoBLL {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = factory.createEntityManager();
    private static EntityTransaction transaction = em.getTransaction();

    public static void criar(RecursoEntity recurso){
        transaction.begin();
        em.persist(recurso);
        transaction.commit();
    }

    public static void apagar(RecursoEntity recurso){
        transaction.begin();
        em.remove(recurso);
        transaction.commit();
    }

    public static void update(){
        transaction.begin();
        transaction.commit();
    }

    public static RecursoEntity findRecurso(long id){ return em.find(RecursoEntity.class, id); }

    public static List<RecursoEntity> listar(){
        return em.createQuery("from RecursoEntity ").getResultList();
    }

}



