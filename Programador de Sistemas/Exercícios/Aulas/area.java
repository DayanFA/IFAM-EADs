package helloworld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double base, altura;
        double area;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o valor da base:");
        base = entrada.nextDouble();

        System.out.println("Insira o valor da altura:");
        altura = entrada.nextDouble();

        area = (base * altura) / 2;

        System.out.println("O valor da área é:");
        System.out.println(area);
    }
}
