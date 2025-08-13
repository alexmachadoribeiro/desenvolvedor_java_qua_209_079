package com.polimorfismo.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);

        // input do usuário
        System.out.println("DADOS DO USUÁRIO:");
        System.out.println("Informe o nome do usuário: ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o CPF do usuário: ");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe a data de nascimento do usuário: ");
        usuario.dataNascimento = leia.nextLine();
        System.out.println("Informe o e-mail do usuário: ");
        usuario.email = leia.nextLine();
        System.out.println("Informe o telefone do usuário: ");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe o endereço do usuário: ");
        usuario.endereco = leia.nextLine();

        // input da empresa
        System.out.println("\nDADOS DA EMPRESA:");
        System.out.println("Informe a razão social da empresa:");
        empresa.razaoSocial = leia.nextLine();
        System.out.println("Informe o nome da empresa:");
        empresa.nomeFantasia = leia.nextLine();
        System.out.println("Informe o CNPJ da empresa:");
        empresa.cnpj = leia.nextLine();
        System.out.println("Informe o email da empresa:");
        empresa.email = leia.nextLine();
        System.out.println("Informe o telefone da empresa:");
        empresa.telefone = leia.nextLine();
        System.out.println("Informe o endereço da empresa:");
        empresa.endereco = leia.nextLine();

        // executar os métodos dos objetos
        System.out.println(usuario.cumprimentar());
        System.out.println(empresa.cumprimentar());

        leia.close();
    }
}
