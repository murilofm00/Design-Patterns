import Jogador.Jogador;
import Arma.*;

public class Main {
    public static void main(String[] args) {
       Jogador jogador = new Jogador();
       jogador.setArma(new Espada());
       int danoRecebido = jogador.atacar();
        System.out.println(danoRecebido);
    }
}
