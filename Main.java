package projetin;

import java.util.Objects;
import java.util.Scanner;

public class Main {
	
	static Scanner leitor = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		String res;
			
		Mago mago = new Mago("mago", 20, 150);
		inimigoTest enemy = new inimigoTest("shrek", 50, 200);

		res = input();
		if (Objects.equals(res, "1")) {
			mago.ataque(enemy.getHP());
		} else if (Objects.equals(res, "2")) {
			mago.ataqueEspecial(enemy.getHP());
		} else {
			System.out.println("inválido");
		}
	}

	public static String input() {return leitor.nextLine();}
}
