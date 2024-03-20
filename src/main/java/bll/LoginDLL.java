package bll;

import entity.Login;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class LoginDLL {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static EntityManager em = factory.createEntityManager();
    private static EntityTransaction transaction = em.getTransaction();

    public static void criar(Login login){
        transaction.begin();
        //em.createNativeQuery("INSERT INTO \"Login\" (login, senha) values(\'" + login + "\',\'" + senha + "\')");
        em.persist(login);
        transaction.commit();
    }

    public static void apagar(Login login){
        transaction.begin();
        em.remove(login);
        transaction.commit();
    }
    public static void update(){
        transaction.begin();
        transaction.commit();
    }

    public static Login findLogin(String id){
        return em.find(Login.class, id);
    }

    public static List<Login> listar(){
        return em.createQuery("from Login").getResultList();
    }

}

