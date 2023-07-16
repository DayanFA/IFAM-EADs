package entradasaida;
import java.util.Scanner;
public class Main 
{
	public static void main (String [] args)
	{
		String nome;
		int idade;
		float peso;
		char cnh;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nome completo: ");
		nome = entrada.nextLine();
		System.out.println("Idade: ");
		idade = entrada.nextInt();
		System.out.println("Peso: ");
		peso = entrada.nextFloat();
		System.out.println("Categoria da CNH: ");
		cnh = entrada.next().charAt(0);
		System.out.println("Nome completo: ");
		System.out.println(nome);
		System.out.println("Idade: ");
		System.out.println(idade);
		System.out.println("Peso: ");
		System.out.println(peso);
		System.out.println("Categoria da CNH: ");
		System.out.println(cnh);
	}
}
