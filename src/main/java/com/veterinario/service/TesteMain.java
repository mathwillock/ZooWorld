package com.veterinario.service;

import com.veterinario.model.Paciente;
import com.veterinario.model.Proprietario;

import java.time.LocalDate;

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


    }



}
