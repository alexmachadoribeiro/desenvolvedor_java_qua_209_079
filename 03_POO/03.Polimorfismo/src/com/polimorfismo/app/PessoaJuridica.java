package com.polimorfismo.app;

final public class PessoaJuridica extends Pessoa {
    // atributos
    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;

    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String email, String telefone, String endereco) {
        super(email, telefone, endereco);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String cumprimentar() {
        return "Olá, somos da empresa " + this.nomeFantasia + ", de razão social " + this.razaoSocial + " cujo CNPJ é " + this.cnpj + ". Nosso e-mail é " + this.email + ", nosso telefone de contato é " + this.telefone + " e nosso endereço é " + this.endereco + ".";
    }
}
