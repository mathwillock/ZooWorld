package com.veterinario.service;

import com.veterinario.model.Consulta;
import com.veterinario.model.MedicoVeterinario;
import com.veterinario.model.Paciente;
import com.veterinario.model.Proprietario;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
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

        for (Consulta consultas : consultaList) {
            if (consultas.getPaciente().getNome().equals(nome) && consultas
                    .getPaciente().getEspecie().equals(especie)) {
                consultaList.sort((Consulta a, Consulta b) -> b.getDataDiaHora().compareTo(a.getDataDiaHora()));
                consultaList.forEach(c -> System.out.println(c.getPaciente() + " "
                        + c.getMotivo() + " " + c.getDiagnosticoPossivel() + " " + c.getTratamentoSeguido() + " " +
                        c.getMedicoVeterinario().getNome() + " " + c.getDataDiaHora()));

            }
        }
        return null;
    }

    public String listarConsultasPorDia(LocalDateTime dataDiaHora) {

        for (Consulta consultas : consultaList) {
            if (consultas.getDataDiaHora().equals(dataDiaHora)){

                consultaList.sort((Consulta a, Consulta b) -> b.getDataDiaHora().compareTo(a.getDataDiaHora()));
                consultaList.forEach(c -> System.out.println(
                        c.getPaciente().getNumeroDoPaciente()
                                + " " + c.getPaciente().getNome()
                                + " " + c.getPaciente().getEspecie()
                                + " " + c.getPaciente().getSexo()
                                + " " + c.getPaciente().getRaca()
                                + " " + c.getMotivo()
                                + " " + c.getDiagnosticoPossivel()
                                + " " + c.getTratamentoSeguido()
                                + " " + c.getDataDiaHora()
                                + " " + c.getPaciente().getProprietario().getNome()
                                + " " + c.getPaciente().getProprietario().getCpf()
                                + " " + c.getMedicoVeterinario().getNome()
                                + " " + c.getMedicoVeterinario().getNumeroRegistro()


                ));


            }
        }
        return null;
    }


}
