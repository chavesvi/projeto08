package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] room = new Aluguel[10];
		
		System.out.print("Enter the number of students who will rent a room: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("Name of student: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Number of room: ");
			int num = sc.nextInt();
			while (room[num] != null) {
				System.out.println("ROOM OCCUPIED!");
				System.out.print("Choose another room: ");
				num = sc.nextInt();
			}
			room[num] = new Aluguel(name, email, num);
			System.out.println();
		}
		
		for (int i=0; i<room.length; i++) {
			if (room[i] != null) {
				System.out.println(room[i].toString());
			}
		}
		
		sc.close();

	}

}
