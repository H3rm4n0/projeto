package projetin;

import java.util.Scanner;

public class Main {
	
	static Scanner leitor = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		String res;
			
	Mago mago = new Mago("mago", 20, 150);
	inimigoTest enemy = new inimigoTest("shrek", 50, 200);
	
	System.out.printf("Escolha:\n1 - Ataque\n2 - Ataque Especial");
	res = input();
	if (res == "1") {
		mago.ataque(enemy.getHP());
		
		
	} else if (res == "2") {
		mago.ataqueEspecial(enemy.getHP());
	} else {
		System.out.println("inválido");
	}
	
		
	}
	
	
	
	
	
	
	
	
	
	
public static String input() {
		
		String leitura = leitor.nextLine() ;
		
		return leitura;
	}
}
