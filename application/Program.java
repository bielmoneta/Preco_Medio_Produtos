package application_vetor2; 

import java.util.Locale;
import java.util.Scanner;
import entities_vetor2.Produto;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vetor = new Produto[n];
		
		for(int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}
		
		double soma = 0.0;
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreço();
		}
		
		double media = soma / vetor.length;
		System.out.printf("Média: %.2f", media);
		
		sc.close();
	}
} 
