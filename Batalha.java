package projetin;

import java.util.Objects;

public class Batalha {

    public static void battle(Personagem user, Personagem enemy){
        while (user.getHP() > 0  && enemy.getHP() > 0){
            if (Objects.equals(user.getAction(), "ataque")){
                user.ataque(enemy);
            }else if (Objects.equals(user.getAction(), "ataque especial")) {
                user.ataqueEspecial(enemy);
            }
            enemy.ataque(user);
            if (enemy.getBurn()){
                enemy.setHP(enemy.getHP() - 15);
            }
        }
    }
}
