package br.com.persistence;

import br.com.entities.AbstractEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public abstract class AbstractDao<T extends AbstractEntity> {

    EntityManager em;

    public AbstractDao() {
    }

    public AbstractDao(EntityManager em) {
        this.em = em;
    }

    public void persist(T entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    //  em.getTransaction().rollback();
        em.close();

    }

    public void remove(T entity) {
        em.getTransaction().begin();
        try {
            entity = em.find(getEntityClass(), entity.getId());
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void atualizar(T entity) {
        em.getTransaction().begin();
        try {
            em.merge(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public List<T> listar() {
        Query query = em.createQuery("select m from " + getEntityClass().getSimpleName() + " m");

        return query.getResultList();
    }

    public abstract Class<T> getEntityClass();

}
