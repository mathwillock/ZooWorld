package com.veterinario.dto.medico;

import com.veterinario.model.MedicoVeterinario;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class MedicoRequestForm implements Serializable {

    private String nome, sobrenome, cpf;
    private String especialidade;
    private Integer numeroRegistro;

    public MedicoRequestForm() {
    }

    public MedicoRequestForm(String nome, String sobrenome, String cpf, String especialidade, Integer numeroRegistro) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.numeroRegistro = numeroRegistro;
    }

    public MedicoVeterinario converte() {
        return new MedicoVeterinario(nome, sobrenome, cpf, numeroRegistro, especialidade);
    }


}
