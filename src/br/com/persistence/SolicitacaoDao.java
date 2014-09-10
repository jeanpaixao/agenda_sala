
package br.com.persistence;

import javax.persistence.EntityManager;

public class SolicitacaoDao extends AbstractDao{
    
    public SolicitacaoDao(EntityManager em) {
        super(em);

}

    public SolicitacaoDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class getEntityClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
