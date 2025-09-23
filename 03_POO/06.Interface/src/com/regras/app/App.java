package com.regras.app;

import java.util.Scanner;
import com.regras.model.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new Conta(null, null, "1234-5", "12345-6", 0);
        Scanner leia = new Scanner(System.in);

        // declaração de variável
        int opcao;
        double valor;

        System.out.println("Informe o nome do titular da conta:");
        cc.setTitular(leia.nextLine());
        System.out.println("Informe o CPF do titular da conta:");
        cc.setCpf(leia.nextLine());

        do {
            // menu
            System.out.println("BANCO JAVA");
            System.out.println("1 - Exibir dados da conta");
            System.out.println("2 - Fazer depósito");
            System.out.println("3 - Fazer saque");
            System.out.println("4 - Sair do programa");
            System.out.println("Informe a opção desejada:");

            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    cc.exibirDados();
                    break;
                case 2:
                    System.out.println("Informe o valor do depósito, em R$:");
                    valor = leia.nextDouble();
                    System.out.println((valor > 0) ? "Depósito efetuado com sucesso. Saldo: R$ " + cc.fazerDeposito(valor) : "Valor do depósito inválido.");
                    break;
                case 3:
                    System.out.println("Informe o valor do saque, em R$:");
                    valor = leia.nextDouble();
                    System.out.println((valor > 0 && valor <= cc.getSaldo()) ? "Saque efetuado com sucesso. Saldo: R$ " + cc.fazerSaque(valor) : "Valor do saque inválido.");
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        leia.close();
    }
}
