package projetin;

public class Arqueiro extends Personagem{

    public Arqueiro(){
        this.setNome(getNome());
        this.setHP(200);
        this.setMana(0);
    }

    @Override
    public void ataque(Personagem enemy){
        int dmg = (rand.nextInt(70 - 60) + 60);
        if (rand.nextInt(10) == 1){enemy.setHP(enemy.getHP() - (dmg + (dmg * 50/100)));}
        else{enemy.setHP(enemy.getHP() - dmg);}
    }
}

