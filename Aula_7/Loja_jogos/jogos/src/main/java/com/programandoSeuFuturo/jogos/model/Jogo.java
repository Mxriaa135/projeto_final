package com.programandoSeuFuturo.jogos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Jogo {
    private int id;
    private String nome;
    private String descricao;
    private String imagem;
    private double preco;

    @JsonProperty("esta_favoritado")
    private boolean estaFavoritado;

    public Jogo(){}

    public Jogo(int id, String nome, String descricao, String imagem, double preco, boolean estaFavoritado) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
        this.preco = preco;
        this.estaFavoritado = estaFavoritado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isEstaFavoritado() {
        return estaFavoritado;
    }

    public void setEstaFavoritado(boolean estaFavoritado) {
        this.estaFavoritado = estaFavoritado;
    }
}
