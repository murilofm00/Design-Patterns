package Personagem.Jogador;

import Arma.*;
import Personagem.Personagem;


public class Jogador extends Personagem {

    public Jogador(String nome, Arma arma) {
        setNome(nome);
        setVida(100);
        setArma(arma);
    }

    @Override
    public int receberAtaque(int danoRecebido) {
        receberDano(danoRecebido);
        return 0;
    }
}
