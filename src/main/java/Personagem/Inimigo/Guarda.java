package Personagem.Inimigo;

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
        int danoNaoDefendido = 0;

        if(danoRecebido > getArmadura()) {
            danoNaoDefendido = danoRecebido - getArmadura();
        }

        printDefesa(danoRecebido, danoNaoDefendido);

        receberDano(danoNaoDefendido);
    }
}
