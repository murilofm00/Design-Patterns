package Personagem.Inimigo;

import Arma.Arma;
import personagem.Personagem;

public abstract class Inimigo extends Personagem {

    private int armadura;



    public int getArmadura() {
        return armadura;
    }

    protected void setArmadura(int armadura) {
        this.armadura = armadura;
    }



    @Override
    public int receberAtaque(int danoRecebido) {
        int danoAtaque = 0;
        defender(danoRecebido);
        if(isAlive()) {
            movimentar();
            danoAtaque = atacar();
        }
        return danoAtaque;
    }


    protected abstract void defender(int danoRecebido);

    public void printDefesa(int danoRecebido, int danoNaoDefendido) {
        int defesa = danoRecebido - danoNaoDefendido;
        System.out.println("O " + getNome() + " defendeu " + defesa + " de dano");
        System.out.println("O " + getNome() + " recebeu " + danoRecebido + " de dano");
    }
}
