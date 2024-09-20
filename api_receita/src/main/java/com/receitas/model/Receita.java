package com.receitas.model;

public class Receita {
    private long id;
    private String nome;
    private String ingredientes;
    private String instrucoes;

    // Constructor
    public Receita(long id, String nome, String ingredientes, String instrucoes) {
        this.id = id;
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.instrucoes = instrucoes;
    }

    public Receita() {
        
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }
    
    public String getInstrucoes() {
        return instrucoes;
    }

    // Setters
    public void setId(long newId) {
        this.id = newId;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public void setIngredientes(String newIngredientes) {
        this.ingredientes = newIngredientes;
    }

    public void setInstrucoes(String newInstrucoes) {
        this.instrucoes = newInstrucoes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Receita other = (Receita) obj;
        if (id != other.id)
            return false;
        return true;
    }
}