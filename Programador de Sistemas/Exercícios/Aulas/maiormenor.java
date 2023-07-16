package helloworld;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.valueOf(JOptionPane.showInputDialog("Insira o valor do primeiro número:"));
        num2 = Integer.valueOf(JOptionPane.showInputDialog("Insira o valor do segundo número:"));

        if (num1 > num2) {
            String res = "O número " + String.valueOf(num1) + " é maior que " + String.valueOf(num2);
            JOptionPane.showMessageDialog(null, res);
        } else {
            String res = "O número " + String.valueOf(num2) + " é maior que " + String.valueOf(num1);
            JOptionPane.showMessageDialog(null, res);
        }
    }
}
