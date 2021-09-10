package com.veterinario.model;

import lombok.Setter;

import java.time.LocalDate;

@Setter
public class Proprietario {

    private String cpf, nome, sobreNome;
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

    public Proprietario(String cpf, String nome, String sobreNome, String endereco, String telefoneContato, LocalDate dataDeNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.endereco = endereco;
        this.telefoneContato = telefoneContato;
        this.dataDeNascimento = dataDeNascimento;
    }


    @Override
    public String toString() {
        return "Proprietario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }
}
