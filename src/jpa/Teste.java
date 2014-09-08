package jpa;

import br.com.entities.Pessoa;
import br.com.entities.Solicitante;
import br.com.persistence.services.PessoaService;


public class Teste {
    public static void main(String[] args) {
        
      Pessoa p = new Solicitante();
      PessoaService ps = new PessoaService();
       p.setNome("Jean");
       p.setCPF("132.764.926.245");
       p.setEmail("jeutdb@hotmail.com");
       p.setTelefone1("32375823");
       p.setTelefone2("88882064");
       ps.salvarPessoa(p);

    }
    
}
