package com.veterinario.controllers;

public class Validador
{

    public boolean validaCPF (String cpf)
    {
         boolean matchesPontoTraco = cpf.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");
         boolean matchesSoNumero = cpf.matches ("[0-9]{11}");
         final int digitoscpf = 11;

         int soma_9prim = 0;
         int soma_10prim = 0;
         int soma_11dig = 0;

        String result = cpf;
        int [] vetorcpf;

        if (matchesPontoTraco)
        {
            result = result.replace(".", "");
            result = result.replace("-", "");
        }

        if (!matchesSoNumero)
        {
            return false;
        }


        //tratando o cpf

        vetorcpf = result.chars().map(x-> x - '0').toArray();

        int fact = 10;
        for (int i = 0; i < 9; i++)
        {
            soma_9prim += fact*vetorcpf[i];
            fact--;
        }

        if (vetorcpf[9] != (soma_9prim%11)%10)
        {
            //throw cpf invalido
            return false;
        }

        fact = 11;
        for (int i = 0; i < 9; i++)
        {
            soma_10prim += fact*vetorcpf[i];
            fact--;
        }

        if (vetorcpf[9] != (soma_10prim%11)%10)
        {
            //throw cpf invalido
            return false;
        }


        return true;

    }

}
