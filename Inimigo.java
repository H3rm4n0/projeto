package projetin;

import java.util.Random;


public class Inimigo extends Personagem{

    Random rand = new Random();

    public Inimigo() {
        super();
        this.setNome("Goblin");
        this.setHP(100);
    }

    @Override
    public void ataque(Personagem personagem) {
        personagem.setHP(personagem.getHP() - (rand.nextInt(20 - 10) + 10));
    }
}
