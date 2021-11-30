package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] quartos = new Aluguel[10];
		
		System.out.print("Informe a quantidade de alunos que alugarão um quarto: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("Nome do aluno(a): ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Número do quarto: ");
			int num = sc.nextInt();
			while (quartos[num] != null) {
				System.out.println("QUARTO OCUPADO!");
				System.out.print("Escolha outro quarto: ");
				num = sc.nextInt();
			}
			quartos[num] = new Aluguel(nome, email, num);
			System.out.println();
		}
		
		
		for (int i=0; i<quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(quartos[i].toString());
			}
		}
		
		
		
		sc.close();

	}

}
