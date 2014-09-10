package br.com.persistence.services;

import br.com.entities.Pessoa;
import br.com.persistence.PessoaDao;

public class PessoaService extends AbstractService{

  public void salvarPessoa(Pessoa p) {
        em.getTransaction().begin();
        PessoaDao pessoaDao = new PessoaDao(em);
        pessoaDao.persist(p);
        em.getTransaction().commit();
        em.close();

    }

    public void removerPessoa(Pessoa p) {
        em.getTransaction().begin();
        PessoaDao pessoaDao = new PessoaDao(em);
        pessoaDao.remove(p);
        em.getTransaction().commit();
        em.close();
    }

    public void atualizarPessoa(Pessoa p) {
        em.getTransaction().begin();
        PessoaDao pessoaDao = new PessoaDao(em);
        pessoaDao.atualizar(p);
        em.getTransaction().commit();
        em.close();
    }

    public Pessoa getPessoa(Pessoa p) {
        em.getTransaction().begin();
        PessoaDao pessoaDao = new PessoaDao(em);
     
        em.getTransaction().commit();
        em.close();

        return null;
    }
}
