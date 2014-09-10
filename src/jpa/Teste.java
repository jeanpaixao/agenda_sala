package jpa;

import br.com.entities.Evento;
import br.com.entities.Pessoa;
import br.com.entities.Sala;
import br.com.entities.Solicitante;
import br.com.persistence.services.EventoService;
import br.com.persistence.services.PessoaService;
import br.com.persistence.services.SalaService;

public class Teste {

    public static void main(String[] args) {

        Sala sala = new Sala();
        sala.setBloco("H");
        sala.setCapacidade(10);
        sala.setHaveWifi(false);
        sala.setNome("DEMID");
        sala.setQuantArCondicionado(3);
        sala.setQuantDatashow(0);
        sala.setQuantInternetCabo(2);
        sala.setQuantSom(2);
        sala.setQuantTelao(1);
        sala.setTipoSala("Auditorio");
        SalaService salaService = new SalaService();
        salaService.salvarSala(sala);
        
        Pessoa p = new Solicitante();
        PessoaService ps = new PessoaService();
        p.setCPF("017.376.454.63");
        p.setEmail("jeutdb@hotmai.com");
        p.setNome("José Jailton");
        p.setTelefone1("99940394");
        p.setTelefone2("03034dd");
        ps.salvarPessoa(p);
        
        Evento evento = new Evento();
        EventoService es = new EventoService();
        evento.setDescricao("Descricao do evento");
        evento.setInicio(null);
        evento.setParticipantes(23);
        evento.setSala(sala);
        evento.setSolicitacao(null);
        es.salvarEvento(evento);
        
        
        

    }
}
