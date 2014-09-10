package br.com.persistence.services;

import br.com.entities.Evento;
import br.com.persistence.EventoDao;

public class EventoService extends AbstractService {

    public void salvarEvento(Evento ev) {
        em.getTransaction().begin();
        EventoDao eventoDao = new EventoDao(em);
        eventoDao.persist(ev);
        em.getTransaction().commit();
        em.close();

    }

    public void removerEvento(Evento e) {
        em.getTransaction().begin();
        EventoDao eventoDao = new EventoDao(em);
        eventoDao.remove(e);
        em.getTransaction().commit();
        em.close();
    }

    public void atualizarEvento(Evento e) {
        em.getTransaction().begin();
        EventoDao eventoDao = new EventoDao(em);
        eventoDao.atualizar(e);
        em.getTransaction().commit();
        em.close();
    }

    public Evento getEvento(Evento e) {
        em.getTransaction().begin();
        EventoDao eventoDao = new EventoDao(em);
     
        em.getTransaction().commit();
        em.close();

        return null;
    }
}
