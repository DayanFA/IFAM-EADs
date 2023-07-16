package helloworld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        n1 = entrada.nextInt();
        System.out.println("Insira o segundo número:");
        n2 = entrada.nextInt();
        System.out.println("Insira o terceiro número:");
        n3 = entrada.nextInt();

        if ((n1 < n2 + n3) && (n2 < n1 + n3) && (n3 < n1 + n2)) {
            if ((n1 == n2) && (n2 == n3)) {
                System.out.println("Triângulo equilátero.");
            } else {
                if ((n1 == n2) || (n1 == n3) || (n2 == n3)) {
                    System.out.println("Triângulo isósceles.");
                } else {
                    System.out.println("Triângulo escaleno.");
                }
            }
        } else {
            System.out.println("Os números informados não formam um triângulo.");
        }
    }
}
