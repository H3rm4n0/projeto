package projetin;

import java.util.Random;

public abstract class Personagem {

	Random rand = new Random();
	int danoAleatorio = (rand.nextInt(20) + 30);

	private String nome;
	private int mana;
	private int hp;
	private String action;
	private boolean burn;

	public Personagem(String nome, int mana, int hp) {
		this.nome = nome;
		this.mana = mana;
		this.hp = hp;
		this.burn = false;
	}

	public Personagem() {
	}
	
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
