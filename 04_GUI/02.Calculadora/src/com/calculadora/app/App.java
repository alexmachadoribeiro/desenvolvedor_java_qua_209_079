package com.calculadora.app;

import javax.swing.JOptionPane;
import com.calculadora.controller.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora(0, 0);

        String[] opcoes = {"Somar", "Subtrair", "Multiplicar", "Dividir", "Sair"};
        Object opcao;

        do {
            opcao = JOptionPane.showInputDialog(null, "Selecione uma opção:", "Calculadora", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            if (opcao != "Sair") {
                calculadora.setX(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de X:")));
                calculadora.setY(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de Y:")));
            }

            if (opcao == "Somar") {
                JOptionPane.showMessageDialog(
                    null, 
                    "O resultado da soma é " + 
                    calculadora.somar(calculadora.getX(), calculadora.getY()), 
                    "Soma", 
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
            else if (opcao == "Subtrair") {
                JOptionPane.showMessageDialog(
                    null, 
                    "O resultado da subtração é " + 
                    calculadora.subtrair(calculadora.getX(), calculadora.getY()), 
                    "Subtração", 
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
            else if (opcao == "Multiplicar") {
                JOptionPane.showMessageDialog(
                    null, 
                    "O resultado da multiplicação é " + 
                    calculadora.multiplicar(calculadora.getX(), calculadora.getY()), 
                    "Multiplicação", 
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
            else if (opcao == "Dividir") {
                JOptionPane.showMessageDialog(
                    null, 
                    "O resultado da divisão é " + 
                    calculadora.dividir(calculadora.getX(), calculadora.getY()), 
                    "Divisão", 
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        } while (opcao != "Sair");
    }
}
