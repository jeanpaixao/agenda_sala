package br.com.persistence.services;

import br.com.entities.Solicitacao;
import br.com.persistence.SolicitacaoDao;

public class SolicitacaoService extends AbstractService{
    
       public void salvarSolicitacao(Solicitacao solicitacao){
        em.getTransaction().begin();
        SolicitacaoDao solicitacaoDao = new SolicitacaoDao(em);
        solicitacaoDao.persist(solicitacao);
        em.getTransaction().commit();
    
    }


    public void removerSolicitacao(Solicitacao s) {
        em.getTransaction().begin();
        SolicitacaoDao solicitacaoDao = new SolicitacaoDao(em);
        solicitacaoDao.remove(s);
        em.getTransaction().commit();
        em.close();
    }

    public void atualizarSolicitacao(Solicitacao s) {
        em.getTransaction().begin();
        SolicitacaoDao solicitacaoDao = new SolicitacaoDao(em);
        solicitacaoDao.atualizar(s);
        em.getTransaction().commit();
        em.close();
    }

}
