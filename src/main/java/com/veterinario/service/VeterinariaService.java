package com.veterinario.service;

import com.veterinario.model.Consulta;
import com.veterinario.model.MedicoVeterinario;
import com.veterinario.model.Paciente;
import com.veterinario.model.Proprietario;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
public class VeterinariaService {

    private static List<Proprietario> proprietarioList = new ArrayList<>();
    private static List<Paciente> pacienteList = new ArrayList<>();
    private static List<MedicoVeterinario> medicoVeterinarioList = new ArrayList<>();
    private static List<Consulta> consultaList = new ArrayList<>();

    public VeterinariaService() {
    }


    public static Proprietario criarProprietario(Proprietario proprietario) {
        proprietarioList.add(proprietario);
        return proprietario;
    }

    public static Paciente cadastrarPaciente(Paciente paciente) {
        pacienteList.add(paciente);
        return paciente;
    }

    public static MedicoVeterinario cadastrarMedico(MedicoVeterinario medico) {
        medicoVeterinarioList.add(medico);
        return medico;
    }

    public static Consulta cadastrarConsulta(String motivo, String diagnosticoPossivel, String tratamentoSeguido, Paciente paciente, MedicoVeterinario medicoVeterinario) {
        Consulta novaConsulta = new Consulta(motivo, diagnosticoPossivel, tratamentoSeguido, paciente, medicoVeterinario);
        consultaList.add(novaConsulta);
        return novaConsulta;
    }

    public static String listarConsultasPaciente(String nome, String especie) {
           consultaList.stream()
                   .filter(consulta -> consulta.getPaciente().getNome().equals(nome)
                         && consulta.getPaciente().getEspecie().equals(especie))
                   .sorted((c1, c2) -> c2.getDataDiaHora().compareTo(c1.getDataDiaHora()))
                   .forEach(paciente -> System.out.println(paciente.getPaciente() + " " + paciente.getMotivo()
                         + " " + paciente.getDiagnosticoPossivel() + " " + paciente.getTratamentoSeguido()
                         + " " + paciente.getMedicoVeterinario() + " " + paciente.getPaciente().getProprietario().getNome()));


        return null;
    }


}
