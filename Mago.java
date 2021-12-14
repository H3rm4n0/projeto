package projetin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Mago extends Personagem implements IPersonagem {
	
	Random rand = new Random();
	
	int danoAleatorio = (rand.nextInt(50)+1);
	int manaAdd = 0;
	int manaValor = getMana();
	
	public Mago(String nome, int mana, int HP) {
		super(nome, mana, HP);
	}
	
	
	
	public void personagemAtribs() {
		
		ArrayList<String> ataques = new ArrayList<String> ();
		ataques.add("\n1 - magia simples");
		ataques.add("\n2 - magia especial");
		System.out.printf(getNome() + ":\n" + "\n" + "Mana:" + getMana() + "\n" + "HP:" + getHP() + "\n" + "Ataques:" + Arrays.toString(ataques.toArray()));
	}
		
	
	
		
	public void ataque(int inimigoLife) {
		System.out.println("atacou com magia simples");
		manaAdd+=5;
		int saldoHP = (inimigoLife - danoAleatorio);
		System.out.println(saldoHP);
	}
	
	public void ataqueEspecial(int inimigoLife) {
		if (manaAdd == manaValor) {
			int saldoHP = (inimigoLife - (danoAleatorio*2));
			System.out.println();
			manaAdd = 0;
			
		} else {
			ataque(inimigoLife);
		}
	}
}
