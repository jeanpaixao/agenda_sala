package br.com.persistence.services;

import br.com.entities.Pessoa;
import br.com.persistence.PessoaDao;

public class SolicitanteService extends AbstractService{


    public void salvarSolicitante(Pessoa p) {
        
        PessoaDao pd = new PessoaDao(em);
        pd.persist(p);
        
    }
}
