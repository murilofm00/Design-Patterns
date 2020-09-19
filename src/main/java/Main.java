import Inimigo.*;
import Jogador.Jogador;
import Arma.*;

public class Main {
    public static void main(String[] args) {
       Jogador jogador = new Jogador();
       jogador.setArma(new Espada());
       Inimigo inimigo = new Guarda();
       int danoRecebido = inimigo.receberAtaque(jogador.atacar());
        System.out.println(danoRecebido);
    }
}
