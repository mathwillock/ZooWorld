package com.veterinario.service;

import com.veterinario.model.Proprietario;

import java.util.ArrayList;
import java.util.List;

public class VeterinariaService {

    private static List<Proprietario> proprietarioList = new ArrayList<>();

    public VeterinariaService() {
    }


    public Proprietario criarProprietario(Proprietario proprietario){
       proprietarioList.add(proprietario);
        return proprietario;
    }

}
