package helloworld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, n3, maior;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        n1 = entrada.nextDouble();
        System.out.println("Insira o segundo número:");
        n2 = entrada.nextDouble();
        System.out.println("Insira o terceiro número:");
        n3 = entrada.nextDouble();

        maior = n1;

        if (n2 > maior) {
            maior = n2;
        }

        if (n3 > maior) {
            maior = n3;
        }

        System.out.println("O maior número é: ");
        System.out.println(maior);
    }
}
