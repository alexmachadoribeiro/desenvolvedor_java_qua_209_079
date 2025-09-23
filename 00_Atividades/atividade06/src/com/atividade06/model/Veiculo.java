package com.atividade06.model;

public class Veiculo {
    private String fabricante;
    private String modelo;
    private String placa;
    private String cor;
    private String ano;
    private Pessoa proprietario;

    public Veiculo(String fabricante, String modelo, String placa, String cor, String ano, Pessoa proprietario) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.proprietario = proprietario;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Pessoa getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
}
