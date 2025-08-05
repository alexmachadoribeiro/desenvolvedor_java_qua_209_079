package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        int idade;

        // input
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();

        // operador ternário
        System.out.println(nome + ((idade >= 18) ? " é maior de idade." : " é menor de idade."));

        leia.close();
    }
}
