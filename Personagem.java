package projetin;

public abstract class Personagem {
	
	String nome;
	double XP;
	double mana;
	int HP;
	boolean attack;
	
	/* sei nem se as coisas aqui fazem sentidokkkkkk */
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public double getXP() {
		return XP;
	}
	public void setXP(double XP) {
		this.XP = XP;
	}
	
	
	
	public double getMana() {
		return mana;
	}
	public void setMana(double mana) {
		this.mana = mana;
	}
	
	
	
	public int getHP() {
		return HP;
	}
	public void setHP(int HP) {
		this.HP = HP;
	}
	
	
	
	public boolean getAttack() {
		return attack;
	}
	public void setAttack(boolean attack) {
		this.attack = attack;
	}
	

