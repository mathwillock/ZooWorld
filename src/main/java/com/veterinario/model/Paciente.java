package com.veterinario.model;

import com.veterinario.service.VeterinariaService;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Setter
@Getter
public class Paciente {

    private String numeroDoPaciente;
    private String especie, cor, raca, nome;
    private String sexo;
    private LocalDate dataDeNascimento;
    private Proprietario proprietario;


    public String getNumeroDoPaciente() {
        numeroDoPaciente = UUID.randomUUID().toString();
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
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataDeNascimento.format(format);
    }

    public Paciente() {
    }

    public Paciente(String especie, String cor, String raca, String nome, String sexo, LocalDate dataDeNascimento, String numeroDoPaciente, Proprietario proprietario) {
        this.especie = especie;
        this.cor = cor;
        this.raca = raca;
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.numeroDoPaciente = numeroDoPaciente;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "numeroDoPaciente='" + numeroDoPaciente + '\'' +
                ", especie='" + especie + '\'' +
                ", cor='" + cor + '\'' +
                ", raca='" + raca + '\'' +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", proprietario=" + proprietario +
                '}';
    }
}
