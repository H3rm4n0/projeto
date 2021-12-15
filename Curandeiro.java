package projetin;

import java.util.Random;

public class Curandeiro extends Personagem{

    Random rand = new Random();
    private boolean skill;

    public Curandeiro(){
        super();
        this.setNome(getNome());
        this.setHP(200);
        this.setMana(0);
    }


    @Override
    public void ataque(Personagem enemy){
            if (! enemy.getBurn()){
            if (this.getMana() < 15) { this.setMana(this.getMana() + 5);}
            enemy.setHP(enemy.getHP() - (rand.nextInt(20 - 15) + 15));}
            else{enemy.setHP(enemy.getHP() - (rand.nextInt(20 - 15) + 15));}
    }

    @Override
    public void ataqueEspecial(Personagem enemy){
        if (this.getMana() == 15){
            this.setMana(this.getMana() - 20);
            enemy.setHP(enemy.getHP() - (rand.nextInt(20 - 15) + 15));
            this.setHP(this.getHP() + 50);
        }
    }
}
