package com.veterinario.model;

import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Setter
public class Paciente {

    private final Double numeroDoPaciente = Math.random()*50;
    private String especie, cor, raca, nome;
    private String sexo;
    private LocalDateTime dataDeNascimento;

    public Double getNumeroDoPaciente() {
        return numeroDoPaciente;
    }

    public String getEspecie() {
        return especie;
    }

    public String getCor() {
        return cor;
    }

    public String getRaca() {
        return raca;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }


    public String getDataDeNascimento() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataDeNascimento.format(format);
    }

    public Paciente() {
    }

    public Paciente(String especie, String cor, String raca, String nome, String sexo, LocalDateTime dataDeNascimento) {
        this.especie = especie;
        this.cor = cor;
        this.raca = raca;
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
    }


}
