package com.receitas.service;

import org.springframework.stereotype.Service;

@Service
public class ReceitaService {
    private static List<Receita> listaDeReceitas = new ArrayList<>();

    private void receitaFake(){
        Receita receitaFake = new Receita();
        receitaFake.setId(id:1L);
        receitaFake.setNome(nome:"Lasanha");
        String[] lista = {"Massa de Lasanha", "4 Queijos", "Tompero"};
        receitaFake.setIngredientes(List.of(lista));
        receitaFake.setInstrucoes(intrucoes:"Só juntar tudo e rezar pra dar certo");
        listaDeReceitas.add(receitaFake);
    }

    public ReceitaService(){
        receitaFake();
    }

    
}
