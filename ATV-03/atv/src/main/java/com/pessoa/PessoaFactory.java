package com.pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaFactory {

    List<Pessoa> pessoas = new ArrayList<>();

    public void criarPessoa(String nome, int idade){

        if(pessoas.isEmpty()){
            Pessoa pessoa = new Pessoa(0, idade, nome);
            pessoas.add(pessoa);

        } else{
            int id = pessoas.getLast().getId();
            id++;
            Pessoa pessoa = new Pessoa(id, idade, nome);
            pessoas.add(pessoa);

        }
        

    }

    public List<Pessoa> listarPessoas(){
        return pessoas;
    }
    

}
