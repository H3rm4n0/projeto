package projetin;

public class Lanceiro extends Personagem{

    public Lanceiro(){
        super();
        this.setNome(getNome());
        this.setHP(400);
        this.setMana(0);
    }

    @Override
    public void ataque(Personagem enemy){
        if (this.getMana() < 20) { this.setMana(this.getMana() + 5);}
        enemy.setHP(enemy.getHP() - (rand.nextInt(35 - 25) + 35));
    }

    @Override
    public void ataqueEspecial(Personagem enemy){
        if (this.getMana() >= 20){
            this.setMana(this.getMana() - 20);
            enemy.setHP(enemy.getHP() - ((rand.nextInt(35 - 25) + 35) * 2));
            }
    }
}
