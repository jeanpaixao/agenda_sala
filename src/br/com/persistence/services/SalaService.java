/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.persistence.services;

import br.com.entities.Sala;
import br.com.persistence.SalaDao;

/**
 *
 * @author Jean
 */
public class SalaService extends AbstractService{
    
    public void salvarSala(Sala sala){
        em.getTransaction().begin();
        SalaDao salaDao = new SalaDao(em);
        salaDao.persist(sala);
        em.getTransaction().commit();
    
    }


    public void removerSala(Sala s) {
        em.getTransaction().begin();
        SalaDao salaDao = new SalaDao(em);
        salaDao.remove(s);
        em.getTransaction().commit();
        em.close();
    }

    public void atualizarSala(Sala s) {
        em.getTransaction().begin();
        SalaDao salaDao = new SalaDao(em);
        salaDao.atualizar(s);
        em.getTransaction().commit();
        em.close();
    }

    public Sala getSala(Sala s) {
        em.getTransaction().begin();
        SalaDao salaDao = new SalaDao(em);
     
        em.getTransaction().commit();
        em.close();

        return null;
    }
}
