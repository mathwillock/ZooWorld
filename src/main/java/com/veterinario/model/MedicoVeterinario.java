package com.veterinario.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicoVeterinario extends Pessoa {

    private Integer numeroRegistro;
    private String especialidade;

    public MedicoVeterinario() {
    }

    public MedicoVeterinario(String nome, String sobrenome, String cpf, Integer numeroRegistro, String especialidade) {
        super(nome, sobrenome, cpf);
        this.numeroRegistro = numeroRegistro;
        this.especialidade = especialidade;
    }

    public MedicoVeterinario(String nome, String sobrenome, String cpf, String especialidade, Integer numeroRegistro) {
    }

    @Override
    public String toString() {
        return "MedicoVeterinario{" +
                "cpf=" + super.getCpf() +
                ", nomeDoMedico='" + super.getNome() + '\'' +
                ", sobrenomeDoMedico='" + super.getSobrenome() + '\'' +
                ", numeroRegistro=" + numeroRegistro +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}
