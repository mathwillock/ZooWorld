package com.veterinario.dto.proprietario;

import com.veterinario.model.Proprietario;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Setter
public class ProprietarioDto implements Serializable {

    private String nome, sobrenome;
    private LocalDate dataDeNascimento;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public ProprietarioDto() {
    }

    public ProprietarioDto(String nome, String sobrenome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public static ProprietarioDto converter(Proprietario proprietario) {
        return new ProprietarioDto(proprietario.getNome(), proprietario.getSobreNome(), proprietario.getDataDeNascimento());
    }
}
