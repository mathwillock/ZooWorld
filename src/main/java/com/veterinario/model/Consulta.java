package com.veterinario.model;

import com.veterinario.dto.medico.MedicoRequestForm;
import com.veterinario.dto.paciente.PacienteRequestForm;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Consulta {
    private String motivo;
    private String diagnosticoPossivel;
    private String tratamentoSeguido;
    private LocalDate dataDia;
    private LocalTime hora;
    private PacienteRequestForm paciente;
    private MedicoRequestForm medicoVeterinario;


    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnosticoPossivel() {
        return diagnosticoPossivel;
    }

    public void setDiagnosticoPossivel(String diagnosticoPossivel) {
        this.diagnosticoPossivel = diagnosticoPossivel;
    }

    public String getTratamentoSeguido() {
        return tratamentoSeguido;
    }

    public void setTratamentoSeguido(String tratamentoSeguido) {
        this.tratamentoSeguido = tratamentoSeguido;
    }

    public LocalDate getDataDia() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return dataDia;
    }

    public PacienteRequestForm getPaciente() {
        return paciente;
    }

    public MedicoRequestForm getMedicoVeterinario() {
        return medicoVeterinario;
    }

    public String getHora() {
        return hora.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public Consulta() {
    }
  

    public Consulta(String motivo, String diagnosticoPossivel, String tratamentoSeguido,
                    PacienteRequestForm paciente, MedicoRequestForm medicoVeterinario) {
        this.motivo = motivo;
        this.diagnosticoPossivel = diagnosticoPossivel;
        this.tratamentoSeguido = tratamentoSeguido;
        this.dataDia = LocalDate.now();
        this.hora = LocalTime.now();
        this.paciente = paciente;
        this.medicoVeterinario = medicoVeterinario;

    }

    @Override
    public String toString(){
        return  "\n Paciente: " + paciente
                +"Motivo: " + getMotivo()
                + "\n Diagnóstico: " + getDiagnosticoPossivel()
                + "\n Tratamento a ser seguido:  " + getTratamentoSeguido()
                + "\n Data e hora de atendimento:" + getDataDia()
                + "\n Data e hora de atendimento:" + getHora()
                + "\n Medico Veterinário: " + medicoVeterinario;

    }
}
