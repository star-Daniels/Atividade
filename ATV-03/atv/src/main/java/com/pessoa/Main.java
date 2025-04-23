package com.pessoa;

import java.util.Scanner;

public class Main {

   

    public static void main(String[] args) {
        PessoaFactory pessoa = new PessoaFactory();
        System.out.println("Digite o nome");
        String nome = new Scanner(System.in).nextLine();

        System.out.println("Digite a idade");
        int idade = new Scanner(System.in).nextInt();

        pessoa.criarPessoa(nome, idade);

        pessoa.listarPessoas();
    }
}