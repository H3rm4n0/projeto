package projetin.src;

public class Lanceiro extends Personagem{

    public Lanceiro(){
        this.setNome(getNome());
        this.setHP(400);
        this.setMana(0);
    }

    @Override
    public void ataque(Personagem enemy){
        if (this.getMana() < 10) { this.setMana(this.getMana() + 5);}
        enemy.setHP(enemy.getHP() - (rand.nextInt(35 - 25) + 25));
    }

    @Override
    public void ataqueEspecial(Personagem enemy){
        if (this.getMana() == 10){
            this.setMana(this.getMana() - 10);
            enemy.setHP(enemy.getHP() - ((rand.nextInt(35 - 25) + 25) * 2));
            }
    }
}
