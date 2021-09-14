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
public class ProprietarioRequestForm implements Serializable {

    private String cpf, nome, sobreNome;
    private String endereco;
    private String telefoneContato;
    private LocalDate dataDeNascimento;


    public String getDataDeNascimento() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataDeNascimento.format(format);

    }

    public ProprietarioRequestForm() {
    }

    public ProprietarioRequestForm(String cpf, String nome, String sobreNome, String endereco, String telefoneContato, LocalDate dataDeNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.endereco = endereco;
        this.telefoneContato = telefoneContato;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Proprietario converte() {
        return new Proprietario(nome, sobreNome, cpf, endereco, telefoneContato, dataDeNascimento);

    }
}
