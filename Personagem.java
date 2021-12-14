package projetin;

public abstract class Personagem {
	
	private String nome;
	private int mana;
	private int HP;
	
	
	public Personagem(String nome, int mana, int HP) {
		this.nome = nome;
		this.mana = mana;
		this.HP = HP;
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	
	
	
	public int getHP() {
		return HP;
	}
	public void setHP(int HP) {
		this.HP = HP;
	}
	
	

}

