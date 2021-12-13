package projetin;

import java.util.ArrayList;
import java.util.Arrays;

public class Mago extends Personagem implements IPersonagem {
	
	public Mago(String nome, int XP, int mana, int HP) {
		super(nome, XP, mana, HP);
	}
	
	
	/*public void lista() {
		
	}*/
	
	
	public void ataca() {
		
		ArrayList<String> ataques = new ArrayList<String> ();
		ataques.add("\ntaca fogo");
		ataques.add("\ntaca água");
		ataques.add("\ntaca magia");
		System.out.printf(getNome() + ":\n" + "XP:" + getXP() + "\n" + "Mana:" + getMana() + "\n" + "HP:" + getHP() + "\n" + "Ataques:" + Arrays.toString(ataques.toArray()));
	}
	
	

}
