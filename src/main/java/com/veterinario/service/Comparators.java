package com.veterinario.service;
import com.veterinario.model.Paciente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators implements Comparator<Paciente>
{
    @Override
    public int compare(Paciente p1, Paciente p2) {
        return p1.getProprietario().getNome().compareToIgnoreCase(p2.getProprietario().getNome());
    }
}



