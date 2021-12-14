package projetin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class inimigoTest extends Personagem implements IPersonagem {
	
	Random rand = new Random();
	
	int danoAleatorio = (rand.nextInt(50)+1); 
	
	public inimigoTest(String nome, int mana, int HP) {
		super(nome, mana, HP);
	}
	
	
	
	public void personagemAtribs() {
		
		ArrayList<String> ataques = new ArrayList<String> ();
		ataques.add("\n1 - magician red");
		ataques.add("\n2 - fire hurricane");
		System.out.printf(getNome() + ":\n" + "\n" + "Mana:" + getMana() + "\n" + "HP:" + getHP() + "\n" + "Ataques:" + Arrays.toString(ataques.toArray()));
	}
		
	
		
	public void ataque(int inimigoLife) {
		
			
	}
	
	public void ataqueEspecial(int inimigoLife) {
		
	}
}
