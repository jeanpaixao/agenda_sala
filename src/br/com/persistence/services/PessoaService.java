package br.com.persistence.services;

import br.com.entities.Pessoa;
import br.com.persistence.HibernateUtil;
import br.com.persistence.PessoaDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class PessoaService {

    EntityManagerFactory emf = HibernateUtil.getEmf();
    EntityManager em = emf.createEntityManager();

    public void salvarPessoa(Pessoa p) {
        
        PessoaDao pd = new PessoaDao(em);
        pd.persist(p);
        
    }
}
