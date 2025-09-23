package com.atividade04.app;

import javax.swing.JOptionPane;

import com.atividade04.model.IMC;

public class App {
    public static void main(String[] args) throws Exception {
        IMC imc = new IMC(0.0, 0.0);

        String[] opcoes = {"Calcular IMC", "Sair"};
        Object opcao;

        double imcValor;

        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha a opção desejada:", 
                "IMC", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]
            );
            
            if (opcao == "Calcular IMC") {
                imc.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso em kg:").replace(",", ".")));
                imc.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura em metros:").replace(",", ".")));

                imcValor = imc.calcularIMC();

                JOptionPane.showMessageDialog(
                    null, 
                    "Valor do IMC: " + String.format("%.2f", imcValor) +
                    "\n" + imc.diagnostico(imcValor), 
                    "IMC Resultado", 
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        } while (opcao != "Sair");
    }
}
/*
* atividade 04
* Recrie o app do IMC (Índice de Massa Corporal)
* usando JOptionPane e os conceitos de classe e encapsulamento.
*/