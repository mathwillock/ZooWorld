package com.veterinario.dto.paciente;

import com.veterinario.model.Paciente;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Setter
@Getter
public class PacienteRequestForm implements Serializable {

    private final Double numeroDoPaciente = Math.random()*50;
    private String especie, cor, raca, nome;
    private String sexo;
    private LocalDateTime dataDeNascimento;


    public String getDataDeNascimento() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataDeNascimento.format(format);
    }

    public PacienteRequestForm() {
    }

    public PacienteRequestForm(String especie, String cor, String raca, String nome, String sexo, LocalDateTime dataDeNascimento) {
        this.especie = especie;
        this.cor = cor;
        this.raca = raca;
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Paciente converte(){
        return new Paciente(especie, cor, raca, nome, sexo, dataDeNascimento);
    }
}
