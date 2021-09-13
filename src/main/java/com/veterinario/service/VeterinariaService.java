package com.veterinario.service;

import com.veterinario.model.Consulta;
import com.veterinario.model.Paciente;
import com.veterinario.model.Proprietario;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class VeterinariaService {

    private static List<Proprietario> proprietarioList = new ArrayList<>();
    private static List<Paciente> pacienteList = new ArrayList<>();

    public VeterinariaService() {
    }


    public Proprietario criarProprietario(Proprietario proprietario){
       proprietarioList.add(proprietario);
        return proprietario;
    }

    public Paciente cadastrarPaciente(Paciente paciente) {
        pacienteList.add(paciente);
        return paciente;
    }



}
