package com.atividade06.app;

import javax.swing.JOptionPane;

import com.atividade06.model.Pessoa;
import com.atividade06.model.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa proprietario = new Pessoa(
            null, 
            null, 
            null, 
            null, 
            null, 
            null
        );
        Veiculo veiculo = new Veiculo(
            null, 
            null, 
            null, 
            null, 
            null, 
            proprietario
        );

        // input do proprietario
        proprietario.setNome(JOptionPane.showInputDialog("Informe o nome do proprietário do veículo:"));
        proprietario.setCpf(JOptionPane.showInputDialog("Informe o CPF do proprietário do veículo:"));
        proprietario.setEmail(JOptionPane.showInputDialog("Informe o e-mail do proprietário do veículo:"));
        proprietario.setTelefone(JOptionPane.showInputDialog("Informe o telefone do proprietário do veículo:"));
        proprietario.setEndereco(JOptionPane.showInputDialog("Informe o endereço do proprietário do veículo:"));
        proprietario.setCnh(JOptionPane.showInputDialog("Informe a CNH do proprietário do veículo:"));
    }
}
/*
* Crie uma aplicação onde o usuário cadastra seus dados pessoais e os dados do seu veículo pessoal, e o programa exibe os dados do veículo na tela.
* NOTE: use o conceito de composição,
* onde um dos atributos de veículo é o proprietário.
*/