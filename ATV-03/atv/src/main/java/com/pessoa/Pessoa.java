package com.pessoa;

public class Pessoa {
    int id;
    int idade;
    String nome;


    public Pessoa(int id, int idade, String nome){
        this.id = id;
        this.idade = idade;
        this.nome = nome;

    }

    public int getId() {
        return id;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return" id " + id + " nome " + nome + " idade " + idade;
    }
}
