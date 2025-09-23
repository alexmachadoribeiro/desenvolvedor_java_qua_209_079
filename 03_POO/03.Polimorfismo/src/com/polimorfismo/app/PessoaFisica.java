package com.polimorfismo.app;

final public class PessoaFisica extends Pessoa {
    // atributos
    public String nome;
    public String cpf;
    public String dataNascimento;

    public PessoaFisica(String nome, String cpf, String dataNascimento, String email, String telefone, String endereco) {
        super(email, telefone, endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String cumprimentar() {
        return "Olá, meu nome é " + this.nome + ",  nasci no dia " + this.dataNascimento + ", meu CPF é " + this.cpf + " moro no endereço " + this.endereco + " meu telefone é " + this.telefone + " e meu e-mail é " + this.email + ".";
    }
}
