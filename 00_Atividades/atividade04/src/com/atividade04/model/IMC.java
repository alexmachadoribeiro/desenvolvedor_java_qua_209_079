package com.atividade04.model;

public class IMC {
    private double peso;
    private double altura;

    // construtor
    public IMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // getters e setters
    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public String diagnostico(double imc) {
        return (imc <= 18.5) ? "Você está abaixo do peso."
        : (imc < 25) ? "Você está no peso ideal."
        : (imc < 30) ? "Você está acima do peso."
        : (imc < 35) ? "Você está obeso."
        : (imc < 40) ? "Você está com obesidade nível II."
        : "Você está com obesidade mórbida.";
    }
}
