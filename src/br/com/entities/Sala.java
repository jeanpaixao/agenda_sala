package br.com.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Sala extends AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String bloco;
    private Integer capacidade;
    private Integer quantDatashow;
    private Integer quantSom;
    private Integer quantTelao;
    private boolean haveWifi;
    private Integer quantInternetCabo;
    private Integer quantArCondicionado;
    private String tipoSala;

    @OneToMany
    private List<Evento> eventos;
    @OneToMany
    private List<Solicitacao> solicitacoes;

    public Sala() {
    }

    public Sala(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Integer getQuantDatashow() {
        return quantDatashow;
    }

    public void setQuantDatashow(Integer quantDatashow) {
        this.quantDatashow = quantDatashow;
    }

    public Integer getQuantSom() {
        return quantSom;
    }

    public void setQuantSom(Integer quantSom) {
        this.quantSom = quantSom;
    }

    public Integer getQuantTelao() {
        return quantTelao;
    }

    public void setQuantTelao(Integer quantTelao) {
        this.quantTelao = quantTelao;
    }

    public boolean isHaveWifi() {
        return haveWifi;
    }

    public void setHaveWifi(boolean haveWifi) {
        this.haveWifi = haveWifi;
    }

    public Integer getQuantInternetCabo() {
        return quantInternetCabo;
    }

    public void setQuantInternetCabo(Integer quantInternetCabo) {
        this.quantInternetCabo = quantInternetCabo;
    }

    public Integer getQuantArCondicionado() {
        return quantArCondicionado;
    }

    public void setQuantArCondicionado(Integer quantArCondicionado) {
        this.quantArCondicionado = quantArCondicionado;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public List<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }

    public void setSolicitacoes(List<Solicitacao> solicitacoes) {
        this.solicitacoes = solicitacoes;
    }

}
