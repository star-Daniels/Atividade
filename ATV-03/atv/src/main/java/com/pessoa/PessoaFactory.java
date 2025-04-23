package com.pessoa;
import java.util.ArrayList;
import java.util.List;

public class PessoaFactory {

    ArrayList<Pessoa> pessoas = new ArrayList<>();

    public Pessoa criarPessoa(String nome, int idade){
        
        int id = pessoas.size();

        Pessoa pessoa = new Pessoa(id, idade, nome);
        pessoas.add(pessoa);
        return pessoa;

    }

    public List<Pessoa> listarPessoas(){
        return pessoas;
    }

}
