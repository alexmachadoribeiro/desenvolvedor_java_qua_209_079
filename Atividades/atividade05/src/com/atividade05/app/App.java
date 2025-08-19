package com.atividade05.app;

import javax.swing.JOptionPane;
import com.atividade05.model.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
        Combustivel combustivel = new Combustivel(0, 0);

        String[] opcoes = {"Calcular melhor combustível", "Sair"};
        Object opcao;

        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha uma opção:", 
                null, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]
            );

            if (opcao == "Calcular melhor combustível") {
                combustivel.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da gasolina em R$:").replace(",", ".")));
                combustivel.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do etanol em R$:").replace(",", ".")));

                // output
                JOptionPane.showMessageDialog(
                    null, 
                    combustivel.calculo(), 
                    "Resultado", 
                    JOptionPane.INFORMATION_MESSAGE
                );
            }

        } while (opcao != "Sair");
    }
}
/*
* Crie um app para verificar qual o melhor combustível para
* um carro flex abastecer.
* NOTE: compensa mais abastecer com etanol caso o valor dele seja
* até 70% do valor da gasolina.
*/