package personagem.Jogador;

import Arma.*;
import personagem.Personagem;


public class Jogador extends Personagem {

    public Jogador(String nome, String arma) {
        setNome(nome);
        setVida(100);
        setArma(ArmaFactory.criaArma(arma));
    }

    public void verAtributos() {
        System.out.println("Nome = " + getNome());
        System.out.println("Vida = " + getVida());
        System.out.println("Arma = " + getArma().getNome());
    }

    @Override
    public int receberAtaque(int danoRecebido) {
        receberDano(danoRecebido);
        return 0;
    }
}
