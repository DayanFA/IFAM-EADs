package operadores;
import java.util.Scanner;
public class Main 
{
	public static void main (String [] args)
	{
		String nome;
		int idade, soma, subtracao, multiplicacao, divisao,resto;
		nome = "Júlia";
		idade = 2;
		int num1 =30;
		int num2 = 7;
		soma= num1+num2;
		subtracao = num1-num2;
		multiplicacao = num1 * num2;
		divisao = num1/num2;
		resto = num1%num2;
		System.out.println(nome);
		System.out.println(idade);
		System.out.println("Soma: ");
		System.out.println(soma);
		System.out.println("Subtração: ");
		System.out.println(subtracao);
		System.out.println("Multiplicação: ");
		System.out.println(multiplicacao);
		System.out.println("Divisão: ");
		System.out.println(divisao);
		System.out.println("Resto: ");
		System.out.println(resto);
	}
}