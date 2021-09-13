package com.veterinario.dto.medico;

import com.veterinario.model.MedicoVeterinario;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MedicoResponseDto implements Serializable {

    private String nome, sobrenome;
    private String especialidade;
    private Integer numeroRegistro;

    public MedicoResponseDto() {
    }

    public MedicoResponseDto(String nome, String sobrenome, String especialidade, Integer numeroRegistro) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.especialidade = especialidade;
        this.numeroRegistro = numeroRegistro;
    }

    public MedicoResponseDto converter(MedicoVeterinario medico) {
        return new MedicoResponseDto(medico.getNome(), medico.getSobrenome(),
                medico.getEspecialidade(), medico.getNumeroRegistro());
    }
}
