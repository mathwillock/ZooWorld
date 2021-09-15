package com.veterinario.service;

import com.veterinario.model.Consulta;
import com.veterinario.model.MedicoVeterinario;
import com.veterinario.model.Paciente;
import com.veterinario.model.Proprietario;
import com.veterinario.controllers.Validador;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
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




    public Proprietario criaProprietario(Proprietario proprietario){
       proprietarioList.add(proprietario);
        return proprietario;
    }



    public Proprietario criarProprietario(Proprietario proprietario) {
        proprietarioList.add(proprietario);
        return proprietario;
    }


    public Paciente cadastrarPaciente(Paciente paciente) {
        pacienteList.add(paciente);
        return paciente;
    }

    public MedicoVeterinario cadastrarMedico(MedicoVeterinario medico) {
        medicoVeterinarioList.add(medico);
        return medico;
    }

    public Consulta cadastrarConsulta(String motivo, String diagnosticoPossivel,
                                      String tratamentoSeguido, Paciente paciente,
                                      MedicoVeterinario medicoVeterinario){
        Consulta novaConsulta = new Consulta(motivo, diagnosticoPossivel, tratamentoSeguido, paciente, medicoVeterinario);
        consultaList.add(novaConsulta);
        return novaConsulta;
    }



    public List<Paciente> listarPaciente() {
        Comparators comparadorPorPaciente = new Comparators();
        Collections.sort(pacienteList, comparadorPorPaciente);

        System.out.println(pacienteList.toString());
        return pacienteList;
    }

    public String listarConsultasPaciente(String nome, String especie) {
           consultaList.stream()
                   .filter(consulta -> consulta.getPaciente().getNome().equals(nome)
                         && consulta.getPaciente().getEspecie().equals(especie))
                   .sorted((c1, c2) -> c2.getDataDia().compareTo(c1.getDataDia()))
                   .forEach(paciente -> System.out.println(paciente.getPaciente() + " " + paciente.getMotivo()
                         + " " + paciente.getDiagnosticoPossivel() + " " + paciente.getTratamentoSeguido()
                         + " " + paciente.getMedicoVeterinario().getNome() + " " + paciente.getPaciente().getProprietario().getNome()));


        return null;
    }

    public static Integer totalConsultasMedico(String nome, Integer numeroRegistro) {
        for (Consulta consulta : consultaList) {
            if (consulta.getMedicoVeterinario().getNome().equals(nome) &&
                    consulta.getMedicoVeterinario().getNumeroRegistro().equals(numeroRegistro)) {
                return consultaList.size();
            }
        }
        return null;

    }

    public void listarConsultasPorDia(LocalDate dataDia) {

            consultaList.stream().filter(c -> dataDia.compareTo(c.getDataDia()) == 0)
                    .forEach(c -> System.out.println(
                            c.getPaciente().getNumeroDoPaciente()
                                + " " + c.getPaciente().getNome()
                                + " " + c.getPaciente().getEspecie()
                                + " " + c.getPaciente().getSexo()
                                + " " + c.getPaciente().getRaca()
                                + " " + c.getMotivo()
                                + " " + c.getDiagnosticoPossivel()
                                + " " + c.getTratamentoSeguido()
                                + " " + c.getDataDia()
                                + " " + c.getHora()
                                + " " + c.getPaciente().getProprietario().getNome()
                                + " " + c.getPaciente().getProprietario().getCpf()
                                + " " + c.getMedicoVeterinario().getNome()
                                + " " + c.getMedicoVeterinario().getNumeroRegistro()
                    ));


        }

}
