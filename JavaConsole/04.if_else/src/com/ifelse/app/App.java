package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia o objeto Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        int idade;

        // input
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();

        // estrutura de decisão
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        }
        else {
            System.out.println(nome + " é menor de idade.");
        }

        // fecha objeto leia
        leia.close();
    }
}
