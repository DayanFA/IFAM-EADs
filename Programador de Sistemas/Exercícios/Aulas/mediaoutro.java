package helloworld;

public class Main {
    public static void main(String[] args) {
        int controlador;
        double soma = 0.0;
        double media = 0.0;

        for (controlador = 50; controlador <= 100; controlador++) {
            if (controlador % 2 == 0) {
                soma += controlador;
            }
        }

        media = soma / (controlador - 50);

        System.out.println("A média é: ");
        System.out.println(media);
    }
}
