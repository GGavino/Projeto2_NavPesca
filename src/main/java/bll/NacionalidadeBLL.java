package bll;

import entity.NacionalidadeEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;
public class NacionalidadeBLL {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = factory.createEntityManager();
    private static EntityTransaction transaction = em.getTransaction();

    public static void criar(NacionalidadeEntity nac){
        transaction.begin();
        em.persist(nac);
        transaction.commit();
    }

    public static void apagar(NacionalidadeEntity nac){
        transaction.begin();
        em.remove(nac);
        transaction.commit();
    }

    public static void update(){
        transaction.begin();
        transaction.commit();
    }

    public static NacionalidadeEntity findNacionalidade(long id){
        return em.find(NacionalidadeEntity.class, id);
    }

    public static List<NacionalidadeEntity> listar(){
        return em.createQuery("from NacionalidadeEntity").getResultList();
    }

}
