package com.veterinario.model;

import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Setter
public class Proprietario extends Pessoa {

    private String endereco;
    private String telefoneContato;
    private LocalDateTime dataDeNascimento;


    public String getEndereco() {
        return endereco;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public String getDataDeNascimento() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataDeNascimento.format(format);
    }

   public Proprietario() { 
    }

    public Proprietario(String nome, String sobreNome, String cpf ,String endereco, String telefoneContato, LocalDateTime dataDeNascimento) {
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
