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
        em.persist(entity);
//      
    }

    public void remove(T entity) {

        entity = em.find(getEntityClass(), entity.getId());
        em.remove(entity);

    }

    public void atualizar(T entity) {

        em.merge(entity);

    }

    public T getEntity(T entity) {
        entity = em.find(getEntityClass(), entity.getId());
        return entity;
    }

    public List<T> listar() {
        Query query = em.createQuery("select m from " + getEntityClass().getSimpleName() + " m");
        return query.getResultList();
    }

    public abstract Class<T> getEntityClass();

}
