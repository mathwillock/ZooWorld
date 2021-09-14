package com.veterinario.dto.paciente;

import com.veterinario.model.Paciente;
import com.veterinario.model.Proprietario;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Setter
@Getter
public class PacienteRequestForm implements Serializable {

    private String numeroDoPaciente;
    private String especie, cor, raca, nome;
    private String sexo;
    private LocalDate dataDeNascimento;
    private Proprietario proprietario;


    public String getDataDeNascimento() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataDeNascimento.format(format);
    }

    public String getNumeroDoPaciente() {
        numeroDoPaciente = UUID.randomUUID().toString();
        return numeroDoPaciente;
    }

    public PacienteRequestForm() {
    }

    public PacienteRequestForm(String especie, String cor, String raca, String nome, String sexo, LocalDate dataDeNascimento, Proprietario proprietario) {
        this.especie = especie;
        this.cor = cor;
        this.raca = raca;
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.proprietario = proprietario;
    }

    public Paciente converte(){
        return new Paciente(especie, cor, raca, nome, sexo, dataDeNascimento, numeroDoPaciente, proprietario);

    }
}
