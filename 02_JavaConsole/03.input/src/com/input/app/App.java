package com.input.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instância do objeto de entrada de dados
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        String email;
        int idade;

        // input (entrada de dados)
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();

        // limpeza de buffer
        leia.nextLine();
        
        System.out.println("Informe seu e-mail: ");
        email = leia.nextLine();

        // output (saída de dados)
        System.out.println("Nome: " + nome + ".");
        System.out.println("Idade: " + idade + ".");
        System.out.println("E-mail: " + email + ".");

        // fechar o objeto
        leia.close();
    }
}
