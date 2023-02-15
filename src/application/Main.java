package application;

import java.util.Scanner;

import entities.Festa;
import entities.Local;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informações sobre a festa: ");
		System.out.println("Digite o CPF do responsável: ");
		String name = sc.nextLine();
		System.out.println("Digite a quantidade de convidados");
		int guest = sc.nextInt();
		System.out.println("Digite o custo da festa: ");
		double cost = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Sobre o local da festa:");
		System.out.println("Qual a altura do local ?");
		double heigth = sc.nextDouble();
		System.out.println("Qual a largura do local ?");
		double width = sc.nextDouble();
		
		
		Local local = new Local(width, heigth);
		Festa festa = new Festa(name, guest, cost, local);
		
		
		
		
		System.out.println(festa.mostra());
		System.out.println();
		System.out.println("Tamanho do Local:");
		System.out.println(local.mostra());
		System.out.println();
		festa.classifica();
		festa.possivelLocal();
		
		
	}

}
