package com.veterinario.model;

public class MedicoVeterinario extends Pessoa {

    private Integer numeroRegistro;
    private String especialidade;

    public MedicoVeterinario(String nomeDoMedico, String sobrenomeDoMedico, Integer cpf, Integer numeroRegistro, String especialidade) {
        super(nomeDoMedico, sobrenomeDoMedico, cpf);
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
