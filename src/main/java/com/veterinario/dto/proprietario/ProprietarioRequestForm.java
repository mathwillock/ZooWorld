package com.veterinario.dto.proprietario;

import com.veterinario.model.Proprietario;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Setter
public class ProprietarioRequestForm implements Serializable {

    private String cpf, nome, sobreNome;
    private String endereco;
    private String telefoneContato;
    private LocalDate dataDeNascimento;

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
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
