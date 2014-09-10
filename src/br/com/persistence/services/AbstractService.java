package br.com.persistence.services;

import br.com.persistence.HibernateUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public abstract class AbstractService {
    
     EntityManagerFactory emf = HibernateUtil.getEmf();
     EntityManager em = emf.createEntityManager();
    
}
