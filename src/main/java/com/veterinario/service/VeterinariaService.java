package com.veterinario.service;

import com.veterinario.model.Consulta;
import com.veterinario.model.MedicoVeterinario;
import com.veterinario.model.Paciente;
import com.veterinario.model.Proprietario;
import com.veterinario.controllers.Validador;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class VeterinariaService {

    private static List<Proprietario> proprietarioList = new ArrayList<>();
    private static List<Paciente> pacienteList = new ArrayList<>();
    private static List<MedicoVeterinario> medicoVeterinarioList = new ArrayList<>();
    private static List<Consulta> consultaList = new ArrayList<>();

    private Validador v = new Validador();

    public VeterinariaService() {
    }

    public boolean cadastraProprietario(String nome, String sobreNome, String cpf ,String endereco, String telefoneContato, LocalDateTime dataDeNascimento)
    {

    }

    private Proprietario criaProprietario(Proprietario proprietario){
       proprietarioList.add(proprietario);
        return proprietario;
    }


    private Paciente cadastrarPaciente(Paciente paciente) {
        pacienteList.add(paciente);
        return paciente;
    }

    private MedicoVeterinario cadastrarMedico(MedicoVeterinario medico) {
        medicoVeterinarioList.add(medico);
        return medico;
    }

    public Consulta cadastrarConsulta(String motivo, String diagnosticoPossivel, String tratamentoSeguido, Paciente paciente, MedicoVeterinario medicoVeterinario){
        Consulta novaConsulta = new Consulta(motivo, diagnosticoPossivel, tratamentoSeguido, paciente, medicoVeterinario);
        consultaList.add(novaConsulta);
        return novaConsulta;
    }



    public List<Paciente> listarPaciente(List<Paciente> listapaciente)
    {
            Comparators comparadorPorPaciente = new Comparators();
            Collections.sort(listapaciente, comparadorPorPaciente);

            return listapaciente;

    }


}
