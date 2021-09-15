package com.veterinario.service;

import com.veterinario.dto.medico.MedicoRequestForm;
import com.veterinario.dto.paciente.PacienteRequestForm;
import com.veterinario.dto.proprietario.ProprietarioRequestForm;
import com.veterinario.model.MedicoVeterinario;
import com.veterinario.model.Paciente;
import com.veterinario.model.Proprietario;

import java.time.LocalDate;


import java.time.LocalDateTime;


public class TesteMain {

    public static void main(String[] args) {


        VeterinariaService vs = new VeterinariaService();


        Proprietario alex = new Proprietario(
                "Alex", " Cruz",
                "81440030049", "Joao Dentice",
                "989175347", LocalDate.of(1983,1,22)
        );

        ProprietarioRequestForm cassia = new ProprietarioRequestForm(
                "Cassia", "Guedes",
                "01843051290","Joao Dentice",
                "989175347", LocalDate.of(1987,9,29)
        );

        ProprietarioRequestForm mariaInes = new ProprietarioRequestForm(
                "Maria Inês", "Soares",
                "01843051290","Joao Dentice",
                "989175347", LocalDate.of(1959,6,11)
        );

        ProprietarioRequestForm benjamin = new ProprietarioRequestForm(
                "Benjamin", "Guedes",
                "01843051290","Joao Dentice",
                "989175347", LocalDate.of(2012,3,07)
        );

        PacienteRequestForm lupy = new PacienteRequestForm(
                "Cachorro", "Malhado",
                "Vira-lata", "Lupy",
                "Macho",LocalDate.of(2015, 3,12),
                alex
        );

        PacienteRequestForm luan = new PacienteRequestForm(
                "Gato", "Marrom",
                "Vira-lata", "Luan",
                "Macho",LocalDate.of(2015, 3,12),
                alex
        );

        PacienteRequestForm mel = new PacienteRequestForm(
                "Gato", "Marrom",
                "Vira-lata", "Mel",
                "Mel",LocalDate.of(2015, 3,12),
                alex
        );

        PacienteRequestForm gorda = new PacienteRequestForm(
                "Gato", "Marrom",
                "Vira-lata", "Gorda",
                "Fêmea",LocalDate.of(2015, 3,12),
                alex
        );

        ProprietarioRequestForm alex2 = new ProprietarioRequestForm (
                "Alex",
                "Santos",
                "sdkfgdsdjg",
                "Rua Gauchos",
                "(45)456456456",
                LocalDate.of(1981, 4, 1)
        );

        Proprietario hugo = new Proprietario (
                "Hugo",
                "Damn it",
                "238754827354",
                "Rua Paulista",
                "(45)2482092",
                LocalDate.of(1982, 3, 2)
        );

        Proprietario mark = new Proprietario (
                "Mark",
                "Sa",
                "384958",
                "Rua Berlim",
                "(45)44346346",
                LocalDate.of(1983, 5, 15)
        );

        PacienteRequestForm lulu = new PacienteRequestForm(
                "Cachorro",
                "Branco",
                "Lulu da Pomerandia",
                "lulu",
                "M",
                LocalDate.of(1983, 5, 15),
                alex
        );

        PacienteRequestForm luan2 = new PacienteRequestForm(
                "Gato",
                "Marrom",
                "Siamês",
                "Luan",
                "M",
                LocalDate.of(1983, 5, 15),
                alex
        );

        PacienteRequestForm amora = new PacienteRequestForm(
                "Cachorro",
                "Bege",
                "Bulldog francês",
                "Amora",
                "F",
                LocalDate.of(2011, 3, 23),
                hugo
        );

        PacienteRequestForm apolo = new PacienteRequestForm(
                "Cachorro",
                "Preto",
                "Shih-tzu",
                "Apolo",
                "M",
                LocalDate.of(2010, 4, 12),
                hugo
        );

        PacienteRequestForm bruno = new PacienteRequestForm(
                "Cachorro",
                "Preto",
                "Shih-tzu",
                "Bruno",
                "M",
                LocalDate.of(2000, 11, 7),
                mark
        );

        PacienteRequestForm chrissie = new PacienteRequestForm(
                "Calopsita",
                "Cinza",
                "Corada",
                "Chrissie",
                "F",
                LocalDate.of(2008, 12, 1),
                mark
        );

        MedicoRequestForm mv = new MedicoRequestForm(
//   MedicoVeterinario(String nome, String sobrenome, String cpf, Integer numeroRegistro, String especialidade) {
                "Valter", "CasaGrande", "01849037015",
                "Animais Domésticos", 245832

        );

        MedicoRequestForm mv2 = new MedicoRequestForm(
//   MedicoVeterinario(String nome, String sobrenome, String cpf, Integer numeroRegistro, String especialidade) {
                "Pedro", "CasaGrande", "01849037015",
                "Animais Fazenda", 245832

        );

        vs.createProprietario(alex2);
        vs.createProprietario(cassia);
        vs.createProprietario(mariaInes);
        vs.createProprietario(benjamin);

        vs.createPaciente(luan2);
        vs.createPaciente(lupy);
        vs.createPaciente(mel);
        vs.createPaciente(gorda);

        vs.createMedico(mv);
        vs.createMedico(mv2);

        vs.cadastrarConsulta("Não se alimente.","Dor na barriga",
                "Gotas de orvalho, colhidas pelas freiras cegas do tibet somente com roupas intimas.",
                luan2,mv2);

        vs.cadastrarConsulta("Não se alimente.","Dor na barriga",
                "Gotas de orvalho, colhidas pelas freiras cegas do tibet somente com roupas intimas.",
                mel,mv2);
        vs.cadastrarConsulta("Não se alimente.","Dor na barriga",
                "Gotas de orvalho, colhidas pelas freiras cegas do tibet somente com roupas intimas.",
                lupy,mv);
        vs.cadastrarConsulta("Não se alimente.","Dor na barriga",
                "Gotas de orvalho, colhidas pelas freiras cegas do tibet somente com roupas intimas.",
                gorda,mv);

        LocalDate data = LocalDate.of(2021,9,14);
        LocalDate dataFinal = LocalDate.of(2021,9,12);
        vs.listarConsultasPorDia(data);


    }



}
