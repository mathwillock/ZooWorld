package com.veterinario.model;

import lombok.Setter;

import java.time.LocalDateTime;

@Setter
public class Paciente {

    private Integer numeroDoPaciente;
    private String especie, cor, raca, nome;
    private String sexo;
    private LocalDateTime dataDeNascimento;

    public Integer getNumeroDoPaciente() {
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

    public LocalDateTime getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Paciente() {
    }

    public Paciente(Integer numeroDoPaciente, String especie, String cor, String raca, String nome, String sexo, LocalDateTime dataDeNascimento) {
        this.numeroDoPaciente = numeroDoPaciente;
        this.especie = especie;
        this.cor = cor;
        this.raca = raca;
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
    }


}
