package projetin;

import java.util.Objects;
import java.util.Scanner;

public class Main {
	
	static Scanner leitor = new Scanner(System.in);

	public static void battle(Personagem user, Personagem enemy){
		while (user.getHP() > 0  && enemy.getHP() > 0){
			user.setAction(leitor.nextLine());
			if (Objects.equals(user.getAction(), "ataque")){
				user.ataque(enemy);
			}else if (Objects.equals(user.getAction(), "ataque especial")) {
				user.ataqueEspecial(enemy);
			}
			enemy.ataque(user);
			if (enemy.getBurn()){
				enemy.setHP(enemy.getHP() - 5);
			}
		}
	}


	public static void main(String[] args) {
		Mago user = new Mago();
		Inimigo enemy = new Inimigo();
		battle(user,enemy);
		}
	}
