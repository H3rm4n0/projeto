package projetin.src;

import java.util.Random;


public class Inimigo extends Personagem{

    Random rand = new Random();

    public Inimigo() {
        this.setNome("Goblin");
        this.setHP(500);
    }

    @Override
    public void ataque(Personagem personagem) {
        personagem.setHP(personagem.getHP() - (rand.nextInt(30 - 20) + 20));
    }
}
