package helloworld;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nome;
        String mensagem = "Seja bem vindo ";

        nome = JOptionPane.showInputDialog("Qual seu nome?");
        JOptionPane.showMessageDialog(null, mensagem.concat(nome).concat("."));
    }
}