package projetin;

import java.util.Random;

public class Guerreiro extends Personagem {

    Random rand = new Random();
    private boolean skill;

    public Guerreiro(){
        super();
        this.setNome(getNome());
        this.setHP(300);
        this.setMana(0);
        skill = false;
    }

    public boolean getSkill() {
        return this.skill;
    }
    public void setSkill(Boolean b) {this.skill = b;}

    @Override
    public void ataque(Personagem enemy){
        if (! getSkill()){
        this.setMana(this.getMana() + 5);
        enemy.setHP(enemy.getHP() - (rand.nextInt(30 - 20) + 30));
        } else{
            this.setMana(this.getMana() + 5);
            enemy.setHP((int) (enemy.getHP() - ((rand.nextInt(30 - 20) + 30) * 1.5)));
        }
    }

    @Override
    public void ataqueEspecial(Personagem enemy){
        if (this.getMana() >= 30){
            this.setMana(this.getMana() - 30);
            this.setSkill(true);
        }
    }
}
