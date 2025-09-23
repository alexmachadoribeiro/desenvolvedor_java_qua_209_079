package com.atividade05.model;

public class Combustivel {
    private double gasolina;
    private double etanol;

    public Combustivel(double gasolina, double etanol) {
        this.gasolina = gasolina;
        this.etanol = etanol;
    }

    public double getGasolina() {
        return this.gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public double getEtanol() {
        return this.etanol;
    }

    public void setEtanol(double etanol) {
        this.etanol = etanol;
    }

    public String calculo() {
        return (this.etanol >= this.gasolina*0.7) ? "Melhor abastecer com gasolina." : "Melhor abastecer com etanol.";
    }
}
