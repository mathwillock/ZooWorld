package com.veterinario;

import com.veterinario.model.Consulta;
import com.veterinario.model.MedicoVeterinario;
import com.veterinario.model.Paciente;
import com.veterinario.model.Proprietario;
import com.veterinario.service.VeterinariaService;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

public class Main {


    public static void main(String[] args)  throws IOException {

        HashMap < Proprietario, List<Paciente> > agenda = new HashMap<>();

        VeterinariaService vs = new VeterinariaService();


        Proprietario alex = new Proprietario (
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

        Paciente lulu = new Paciente(
                "Cachorro",
                "Branco",
                "Lulu da Pomerandia",
                "lulu",
                "M",
                LocalDate.of(1983, 5, 15),
                alex
        );

        Paciente luan = new Paciente(
                "Gato",
                "Marrom",
                "Siamês",
                "Luan",
                "M",
                LocalDate.of(1983, 5, 15),
                alex
        );

        Paciente amora = new Paciente(
                "Cachorro",
                "Bege",
                "Bulldog francês",
                "Amora",
                "F",
                LocalDate.of(2011, 3, 23),
                hugo
        );

        Paciente apolo = new Paciente(
                "Cachorro",
                "Preto",
                "Shih-tzu",
                "Apolo",
                "M",
                LocalDate.of(2010, 4, 12),
                hugo
        );

        Paciente bruno = new Paciente(
                "Cachorro",
                "Preto",
                "Shih-tzu",
                "Bruno",
                "M",
                LocalDate.of(2000, 11, 7),
                mark
        );

        Paciente chrissie = new Paciente(
                "Calopsita",
                "Cinza",
                "Corada",
                "Chrissie",
                "F",
                LocalDate.of(2008, 2, 1),
                mark
        );


        MedicoVeterinario matheus = new MedicoVeterinario("matheus", "willock", "132456785", 132, "cardio" );

        vs.criarProprietario(alex);
        vs.criarProprietario(hugo);
        vs.criarProprietario(mark);

        vs.cadastrarPaciente(lulu);
        vs.cadastrarPaciente(luan);
        vs.cadastrarPaciente(amora);
        vs.cadastrarPaciente(apolo);
        vs.cadastrarPaciente(bruno);
        vs.cadastrarPaciente(chrissie);

        vs.cadastrarMedico(matheus);

        Consulta vetSp = vs.cadastrarConsulta("Infarte", "Morreu", "Enterrar", luan, matheus);

        FileOutputStream fos = new FileOutputStream("agenda.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.append(vetSp.toString());

        bw.close();

        System.out.println("Fim do arquivo");



    }



}
