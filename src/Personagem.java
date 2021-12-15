package projetin.src;

import java.util.Random;

public abstract class Personagem {

	Random rand = new Random();
	private String nome;
	private int mana;
	private int hp;
	private String action;
	private boolean burn;


	public String getNome() {
		return this.nome;
	}
	public void setNome(String s){this.nome = s;}
	
	public int getMana() {
		return this.mana;
	}
	public void setMana(int i) {this.mana = i;}
	
	public int getHP() {
		return this.hp;
	}
	public void setHP(int i) { this.hp = i;}

	public boolean getBurn() { return this.burn;}
	public void setBurn(boolean b) {this.burn = b;}

	public String getAction() { return this.action;}
	public void setAction(String s){this.action = s;}

	public void descansar(){
		this.setHP(this.getHP() + 30);

	}

	public void ataque(Personagem personagem){}

	public void ataqueEspecial(Personagem personagem){}
}
