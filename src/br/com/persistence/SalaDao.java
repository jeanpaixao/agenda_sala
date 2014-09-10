package br.com.persistence;

import javax.persistence.EntityManager;

public class SalaDao extends AbstractDao{
     
    
    public SalaDao(EntityManager em){
         super(em);
    }

    @Override
    public Class getEntityClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
