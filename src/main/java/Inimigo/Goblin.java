package Inimigo;

import Arma.Pistola;

public class Goblin extends Inimigo {
    public Goblin() {
        setNome("Goblin");
        setVida(130);
        setArma(new Pistola());
        setArmadura(8);
    }

    @Override
    protected void defender(int danoRecebido) {
        int danoNaoDefendido = danoRecebido - (getArmadura() / 100 );
        printDefesa(danoRecebido, danoNaoDefendido);
        receberDano(danoNaoDefendido);
    }
}
