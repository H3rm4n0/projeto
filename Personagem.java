package projetin;

import java.util.Random;

public abstract class Personagem {

	Random rand = new Random();
	int danoAleatorio = (rand.nextInt(20) + 30);

	private String nome;
	private int mana;
	private int HP;
	private String[] attacks;


	public Personagem(String nome, int mana, int HP) {
		this.nome = nome;
		this.mana = mana;
		this.HP = HP;
	}

	public void ataque(int inimigoLife) {
		System.out.println("atacou com magia simples");
		mana+=5;
		int saldoHP = (inimigoLife - danoAleatorio;
		System.out.println(saldoHP);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getMana() {
		return mana;
	}
	
	public int getHP() {
		return HP;
	}
}
