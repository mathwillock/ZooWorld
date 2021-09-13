package com.veterinario.dto.paciente;

import com.veterinario.model.Paciente;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Setter
@Getter
public class PacienteResponseDto implements Serializable {

    private String especie, cor, raca, nome;
    private String sexo;
    private LocalDateTime dataDeNascimento;

    public PacienteResponseDto(String especie, String cor, String raca, String nome, String sexo, String dataDeNascimento) {
    }

    public String getDataDeNascimento() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataDeNascimento.format(format);
    }

    public PacienteResponseDto() {
    }

    public PacienteResponseDto(String especie, String cor, String raca, String nome, String sexo, LocalDateTime dataDeNascimento) {
        this.especie = especie;
        this.cor = cor;
        this.raca = raca;
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
    }

    public static PacienteResponseDto converter(Paciente paciente) {
        return new PacienteResponseDto(paciente.getEspecie(), paciente.getCor(),
                paciente.getRaca(), paciente.getNome(), paciente.getSexo(), paciente.getDataDeNascimento());
    }
}
