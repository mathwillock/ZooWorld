package com.veterinario.dto.proprietario;

import com.veterinario.model.Proprietario;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Setter
@Getter
public class ProprietarioDto implements Serializable {

    private String nome, sobrenome;
    private LocalDateTime dataDeNascimento;

    public ProprietarioDto(String nome, String sobrenome, String dataDeNascimento) {
    }


    public String getDataDeNascimento() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataDeNascimento.format(format);
    }

    public ProprietarioDto() {
    }

    public ProprietarioDto(String nome, String sobrenome, LocalDateTime dataDeNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public static ProprietarioDto converter(Proprietario proprietario) {
        return new ProprietarioDto(proprietario.getNome(), proprietario.getSobrenome(), proprietario.getDataDeNascimento());
    }
}
