package com.veterinario.controllers;

import com.veterinario.dto.medico.MedicoRequestForm;
import com.veterinario.dto.paciente.PacienteRequestForm;
import com.veterinario.dto.proprietario.ProprietarioRequestForm;
import com.veterinario.model.Consulta;
import com.veterinario.service.VeterinariaService;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) throws IOException {

        VeterinariaService vs = new VeterinariaService();


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
                cassia.converte()
        );

        PacienteRequestForm luan = new PacienteRequestForm(
                "Gato", "Marrom",
                "Vira-lata", "Luan",
                "Macho",LocalDate.of(2015, 3,12),
                cassia.converte()
        );

        PacienteRequestForm mel = new PacienteRequestForm(
                "Gato", "Marrom",
                "Vira-lata", "Mel",
                "Mel",LocalDate.of(2015, 3,12),
                benjamin.converte()
        );

        PacienteRequestForm gorda = new PacienteRequestForm(
                "Gato", "Marrom",
                "Vira-lata", "Gorda",
                "Fêmea",LocalDate.of(2015, 3,12),
                benjamin.converte()
        );

        PacienteRequestForm amora = new PacienteRequestForm(
                "Cachorro",
                "Bege",
                "Bulldog francês",
                "Amora",
                "F",
                LocalDate.of(2011, 3, 23),
                cassia.converte()
        );

        PacienteRequestForm apolo = new PacienteRequestForm(
                "Cachorro",
                "Preto",
                "Shih-tzu",
                "Apolo",
                "M",
                LocalDate.of(2010, 4, 12),
                mariaInes.converte()
        );

        PacienteRequestForm bruno = new PacienteRequestForm(
                "Cachorro",
                "Preto",
                "Shih-tzu",
                "Bruno",
                "M",
                LocalDate.of(2000, 11, 7),
                cassia.converte()
        );

        PacienteRequestForm chrissie = new PacienteRequestForm(
                "Calopsita",
                "Cinza",
                "Corada",
                "Chrissie",
                "F",
                LocalDate.of(2008, 12, 1),
                benjamin.converte()
        );

        MedicoRequestForm mv = new MedicoRequestForm(
                "Valter", "CasaGrande", "01849037015",
                "Animais Domésticos", 1234

        );

        MedicoRequestForm mv2 = new MedicoRequestForm(
                "Pedro", "CasaGrande", "01849037015",
                "Animais Fazenda", 12345

        );

        vs.cadastrarConsulta("Não se alimente.","Dor na barriga",
                "Gotas de orvalho, colhidas pelas freiras cegas do tibet somente com roupas intimas.",
                luan,mv2);

        vs.cadastrarConsulta("Não se alimente.","Dor na barriga",
                "Gotas de orvalho, colhidas pelas freiras cegas do tibet somente com roupas intimas.",
                mel,mv2);
        vs.cadastrarConsulta("Não se alimente.","Dor na barriga",
                "Gotas de orvalho, colhidas pelas freiras cegas do tibet somente com roupas intimas.",
                lupy,mv);
   Consulta vetSp = vs.cadastrarConsulta("Não se alimente.","Dor na barriga",
                "Gotas de orvalho, colhidas pelas freiras cegas do tibet somente com roupas intimas.",
                gorda,mv);

        vs.createProprietario(cassia);
        vs.createProprietario(mariaInes);
        vs.createProprietario(benjamin);

        vs.createPaciente(bruno);
        vs.createPaciente(lupy);
        vs.createPaciente(mel);
        vs.createPaciente(gorda);
        vs.createPaciente(chrissie);
        vs.createPaciente(apolo);
        vs.createPaciente(amora);
        vs.createPaciente(luan);

        vs.createMedico(mv);
        vs.createMedico(mv2);


        LocalDate data = LocalDate.of(2021,9,15);
        LocalDate dataFinal = LocalDate.of(2021,9,12);

        FileOutputStream fos = new FileOutputStream("agenda.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        vs.listarConsultasPorDia(data);

        bw.append(vetSp.toString());
        bw.close();
        System.out.println("Fim do arquivo");

    }
}
