package br.com.persistence;

import br.com.entities.Pessoa;
import javax.persistence.EntityManager;

public class PessoaDao extends AbstractDao {

    
    
    public PessoaDao(){}
    
    public PessoaDao(EntityManager em){
         super(em);
    }
    
    
    
    @Override
    public Class<Pessoa> getEntityClass() {
        return Pessoa.class;
    }

}
