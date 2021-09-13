package com.veterinario.model;

import lombok.Setter;

import java.time.LocalDate;

@Setter
public class Proprietario extends Pessoa {

    private String endereco;
    private String telefoneContato;
    private LocalDate dataDeNascimento;

   public String getCpf() {
       return cpf;
   }

   public String getNome() {
       return nome;
   }

   public String getSobreNome() {
       return sobreNome;
   }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

   public Proprietario() { 
    }

    public Proprietario(String nome, String sobreNome, Integer cpf ,String endereco, String telefoneContato, LocalDate dataDeNascimento) {
        super(nome, sobreNome, cpf);
        this.endereco = endereco;
        this.telefoneContato = telefoneContato;
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Proprietario{" +
                "cpf='" + super.getCpf() + '\'' +
                ", nome='" + super.getNome() + '\'' +
                ", sobreNome='" + super.getSobrenome() + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }
}
