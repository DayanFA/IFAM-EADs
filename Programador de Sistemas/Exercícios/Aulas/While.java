package helloworld;
public class Main {
    public static void main(String[] args) {
        int controle = 1;
        while (controle <= 100) {
            if ((controle % 2) == 0) {
                System.out.println(controle);
            }
            controle++;
        }
    }
}
