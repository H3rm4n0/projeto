package projetin;

public class Mago extends Personagem implements IPersonagem {
	

	int manaValor = getMana();
	attack

	public Mago(String nome, int mana, int HP) {
		super(nome, mana, HP);
	}

	public void personagemAtribs() {
		attacks.add("magia simples");
		attacks.add("magia especial");
	}
	
	public void ataqueEspecial(int inimigoLife) {
		if (manaAdd == manaValor) {
			int saldoHP = (inimigoLife - (danoAleatorio*2));
			manaAdd = 0;
			
		} else {
			ataque(inimigoLife);
		}
	}

	public String listAtrib(){
		return null;
	}
}
