package projetin;

import java.util.Random;

public class Mago extends Personagem{


	Random rand = new Random();

	public Mago(){
		super();
		this.setNome(getNome());
		this.setHP(300);
		this.setMana(0);
	}

	@Override
	public void ataque(Personagem enemy){
		this.setMana(this.getMana() + 5);
		enemy.setHP(enemy.getHP() - (rand.nextInt(50 - 40) + 40));
	}

	@Override
	public void ataqueEspecial(Personagem enemy){
		if (this.getMana() >= 20){
			this.setMana(this.getMana() - 20);
			enemy.setHP(enemy.getHP() - (rand.nextInt(50) + 40));
			enemy.setBurn(true);}
	}
}
