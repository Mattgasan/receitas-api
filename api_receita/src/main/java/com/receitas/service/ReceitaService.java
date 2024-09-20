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

    public ReceitaService() {
        receitaFake();
    }

    public List<Receita> getAll() {
        return listaDeReceitas;
    }

    public Receita getById(long id) {
        Receita _receita = new Receita(id);
        return listaDeReceitas.stream()
                            .filter(r ->.equals(_receita))
                            .findFirst().orElse(other:null);

    }

    public List<Receita> getByIngredientes(String ingredientes) {
        listaDeReceitas.stream()
                .filter(r -> r.getIngredientes().stream().filter(i -> i.equals(ingredientes))).toList();
    }

    public boolean delete(Long id){
        Receita receita = this.getById(id);
        if (receita != ) {
            
        }
    }

}
