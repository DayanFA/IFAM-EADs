package helloworld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double lado;
        double perimetro;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o valor do lado:");
        lado = entrada.nextDouble();

        perimetro = lado * 4;

        System.out.println("O valor do perímetro é:");
        System.out.println(perimetro);
    }
}
