package bll;

import entity.TipoRecursoEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class TipoRecursoBLL {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = factory.createEntityManager();
    private static EntityTransaction transaction = em.getTransaction();

    public static void criar(TipoRecursoEntity tipoR){
        transaction.begin();
        em.persist(tipoR);
        transaction.commit();
    }

    public static void apagar(TipoRecursoEntity tipoR){
        transaction.begin();
        em.remove(tipoR);
        transaction.commit();
    }
    public static void update(){
        transaction.begin();
        transaction.commit();
    }

    public static TipoRecursoEntity findTipoRecurso(long id){
        return em.find(TipoRecursoEntity.class, id);
    }

    public static List<TipoRecursoEntity> listar(){
        return em.createQuery("from TipoRecursoEntity ").getResultList();
    }

}

