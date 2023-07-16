import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mes;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o número do mês desejado: ");
        mes = entrada.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Janeiro.");
                break;
            case 2:
                System.out.println("Fevereiro.");
                break;
            case 3:
                System.out.println("Março.");
                break;
            case 4:
                System.out.println("Abril.");
                break;
            default:
                System.out.println("O mês escolhido é posterior ao mês de abril.");
                break;
        }
    }
}
