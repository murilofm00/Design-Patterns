import Inimigo.*;
import Jogador.Jogador;
import Arma.*;
import Util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Jogador jogador = criaJogador();
        jogador.verAtributos();
        //jogador.setArma(new Espada());
        //Inimigo inimigo = new Guarda();
        //int danoRecebido = inimigo.receberAtaque(jogador.atacar());
        //System.out.println(danoRecebido);
        //InimigoFactory i = new InimigoFactory();
        //inimigo  = i.criaRandom();
        //System.out.println(inimigo.getNome());
        //System.out.println(Random.getRandomIntervalo(0, 5));
    }
    
    public static Jogador criaJogador(){
        System.out.println("Digite o nome do Jogador");
        String nome = SCANNER.nextLine();
        System.out.println("Selecione uma arma: espada, pistola ou arcoflecha");
        String arma = SCANNER.nextLine();
        return new Jogador(nome, arma);
    }
    
}
