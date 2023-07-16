package helloworld;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int soma = 0;
        for (int controlador = 1; controlador <= 100; controlador++) {
            soma += controlador;
        }
        System.out.println("A soma dos cem primeiros números inteiros é igual a:");
        System.out.println(soma);
    }
}
