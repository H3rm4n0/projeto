package projetin;

public class Arqueiro extends Personagem{

    public Arqueiro(){
        super();
        this.setNome(getNome());
        this.setHP(200);
        this.setMana(0);
    }

    @Override
    public void ataque(Personagem enemy){
        enemy.setHP(enemy.getHP() - (rand.nextInt(70 - 60) + 60));
    }

}

