package helloworld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double soma = 0.0;
        double media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a quantidade de números desejada: ");
        n = entrada.nextInt();

        for (int controlador = 0; controlador < n; controlador++) {
            System.out.println("Insira o valor desejado.");
            soma += entrada.nextDouble();
        }

        media = soma / n;
        System.out.println("A média é: ");
        System.out.println(media);
    }
}
