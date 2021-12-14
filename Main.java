package projetin;

import java.util.Scanner;

public class Main {
	
	Scanner leitor = new Scanner(System.in);
		
	public static void main(String[] args) {
			
	Mago mago = new Mago("mago", 20, 150);
	
	System.out.printf("Escolha:\nAtaque\nAtaque Especial");
		
	}
	
	
	
	
	
	
	
	
	
	
	public int input() {
		
		int leitura = Integer.parseInt(leitor.nextLine());
		
		return leitura;
	}
}
