package com.veterinario.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicoVeterinario extends Pessoa {

    private Integer numeroRegistro;
    private String especialidade;

    public MedicoVeterinario(String matheus, String willock, int i, String s, String cardio) {
    }

    public MedicoVeterinario(String nome, String sobrenome, String cpf, Integer numeroRegistro, String especialidade) {
        super(nome, sobrenome, cpf);
        this.numeroRegistro = numeroRegistro;
        this.especialidade = especialidade;
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
