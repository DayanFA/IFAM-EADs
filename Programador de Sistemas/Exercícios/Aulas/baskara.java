package helloworld;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        a = Double.valueOf(JOptionPane.showInputDialog("Insira o valor de a:"));
        b = Double.valueOf(JOptionPane.showInputDialog("Insira o valor de b:"));
        c = Double.valueOf(JOptionPane.showInputDialog("Insira o valor de c:"));

        delta = (b * b) - (4 * a * c);

        JOptionPane.showMessageDialog(null, "O valor de delta é: " + String.valueOf(delta));

        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "Não existem raízes reais para a equação.");
        } else {
            if (delta == 0) {
                x1 = (-b) / (2 * a);
                JOptionPane.showMessageDialog(null, "Duas raízes reais iguais para a equação: " + String.valueOf(x1));
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                String resposta = " " + String.valueOf(x1) + " e " + String.valueOf(x2);
                JOptionPane.showMessageDialog(null, "Duas raízes reais diferentes para a equação:" + resposta);
            }
        }
    }
}
