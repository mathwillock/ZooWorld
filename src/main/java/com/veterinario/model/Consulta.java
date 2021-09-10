package com.veterinario.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Consulta {
    private String motivo;
    private String diagnosticoPossivel;
    private String tratamentoSeguido;
    private LocalDateTime dataDiaHora;
    private Paciente paciente;
    private MedicoVeterinario veterinario;

    public Consulta() {
    }

    public Consulta(String motivo, String diagnosticoPossivel, String tratamentoSeguido, Paciente paciente, MedicoVeterinario veterinario) {
        this.motivo = motivo;
        this.diagnosticoPossivel = diagnosticoPossivel;
        this.tratamentoSeguido = tratamentoSeguido;
        this.dataDiaHora = LocalDateTime.now();
        this.paciente = paciente;
        this.veterinario = veterinario;
    }

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
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return dataDiaHora.format(format);
    }
}
