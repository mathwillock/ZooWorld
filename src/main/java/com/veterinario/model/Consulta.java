package com.veterinario.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Consulta {
    private String motivo;
    private String diagnosticoPossivel;
    private String tratamentoSeguido;
    private LocalDateTime dataDiaHora;

    private Paciente paciente;
    private MedicoVeterinario medicoVeterinario;

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

    public String getDataDiaHora() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        return dataDiaHora.format(format);
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public MedicoVeterinario getMedicoVeterinario() {
        return medicoVeterinario;
    }

    public Consulta() {
    }

    public Consulta(String motivo, String diagnosticoPossivel, String tratamentoSeguido, Paciente paciente, MedicoVeterinario medicoVeterinario) {
        this.motivo = motivo;
        this.diagnosticoPossivel = diagnosticoPossivel;
        this.tratamentoSeguido = tratamentoSeguido;
        this.dataDiaHora = LocalDateTime.now();
        this.paciente = paciente;
        this.medicoVeterinario = medicoVeterinario;
    }

    @Override
    public String toString(){
        return  "\n Paciente: " + paciente
                +"Motivo: " + getMotivo()
                + "\n Diagnóstico: " + getDiagnosticoPossivel()
                + "\n Tratamento a ser seguido:  " + getTratamentoSeguido()
                + "\n Data e hora de atendimento:" + getDataDiaHora()
                + "\n Medico Veterinário: " + medicoVeterinario;

    }
}
