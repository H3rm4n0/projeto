package projetin.src;

import java.util.Random;

public class Mago extends Personagem{


	Random rand = new Random();

	public Mago(){
		this.setNome(getNome());
		this.setHP(250);
		this.setMana(0);
	}

	@Override
	public void ataque(Personagem enemy){
		if (!enemy.getBurn()){
		if (this.getMana() < 20) { this.setMana(this.getMana() + 5);}
		enemy.setHP(enemy.getHP() - (rand.nextInt(35 - 25) + 25));}
		else{enemy.setHP(enemy.getHP() - (rand.nextInt(35 - 25) + 25));}
	}

	@Override
	public void ataqueEspecial(Personagem enemy){
		if (this.getMana() == 20){
			this.setMana(this.getMana() - 20);
			enemy.setHP(enemy.getHP() - (rand.nextInt(35 - 25) + 25));
			enemy.setBurn(true);}
	}
}
