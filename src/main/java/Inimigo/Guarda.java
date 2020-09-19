package Inimigo;

import Arma.Espada;

public class Guarda extends Inimigo {

    public Guarda() {
        setNome("Guarda");
        setVida(200);
        setArma(new Espada());
        setArmadura(10);
    }

    @Override
    protected void defender(int danoRecebido) {
        int danoNaoDefendido = danoRecebido - getArmadura();
        System.out.println("O " + getNome() + " defendeu " + getArmadura() + " de dano");
        if (danoNaoDefendido > 0) {
            receberDano(danoNaoDefendido);
            System.out.println("O " + getNome() + " recebeu " + getArmadura() + " de dano");
        }
    }
}
