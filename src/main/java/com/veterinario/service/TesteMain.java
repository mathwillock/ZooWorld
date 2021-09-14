package com.veterinario.service;

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

        Proprietario cassia = new Proprietario(
                "Cassia", "Guedes",
                "01843051290","Joao Dentice",
                "989175347", LocalDate.of(1987,9,29)
        );

        Proprietario mariaInes = new Proprietario(
                "Maria Inês", "Soares",
                "01843051290","Joao Dentice",
                "989175347", LocalDate.of(1959,6,11)
        );

        Proprietario benjamin = new Proprietario(
                "Benjamin", "Guedes",
                "01843051290","Joao Dentice",
                "989175347", LocalDate.of(2012,3,07)
        );

        Paciente lupy = new Paciente(
                "Cachorro", "Malhado",
                "Vira-lata", "Lupy",
                "Macho",LocalDate.of(2015, 3,12),
                alex
        );

        Paciente luan = new Paciente(
                "Gato", "Marrom",
                "Vira-lata", "Luan",
                "Macho",LocalDate.of(2015, 3,12),
                alex
        );

        Paciente mel = new Paciente(
                "Gato", "Marrom",
                "Vira-lata", "Mel",
                "Mel",LocalDate.of(2015, 3,12),
                alex
        );

        Paciente gorda = new Paciente(
                "Gato", "Marrom",
                "Vira-lata", "Gorda",
                "Fêmea",LocalDate.of(2015, 3,12),
                alex
        );








        Proprietario alex2 = new Proprietario (
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




        //pETS



            Paciente lulu = new Paciente(
                    "Cachorro",
                    "Branco",
                    "Lulu da Pomerandia",
                    "lulu",
                    "M",
                    LocalDate.of(1983, 5, 15),
                    alex
            );

        Paciente luan2 = new Paciente(
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
                LocalDate.of(2008, 24, 1),
                mark
        );






    }



}
