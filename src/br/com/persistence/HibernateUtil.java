package br.com.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

    static private EntityManagerFactory emf;

    static public EntityManagerFactory getEmf() {
        emf = Persistence.createEntityManagerFactory("sala_evento");
        return emf;
    }

}
