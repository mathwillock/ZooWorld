package com.veterinario.model;

public abstract class Pessoa {

    private String nome;
    private String sobrenome;
    private final Integer cpf;

    public Pessoa(String nome, String sobrenome, Integer cpf) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

   public Pessoa() {
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCpf() {
        return cpf;
    }

    // Pendente pois só falta formatar CPF - Marcelo vai assumir.
    public void setCpf(Integer cpf) {
        this.cpf = cpf;
   }

    @Override
    public abstract String toString();
}
