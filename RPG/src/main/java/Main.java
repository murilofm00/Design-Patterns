import Arma.*;
import Personagem.Inimigo.Inimigo;
import Personagem.Inimigo.InimigoFactory;
import Personagem.Jogador.Jogador;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static Inimigo inimigo;

    private static Jogador jogador = criaJogador();

    public static void main(String[] args) {


        jogador.verAtributos();

        while (jogador.isAlive()) {
            realizarCombate();
        }
        System.out.println(jogador.getNome() + " morreu.");
    }

    public static void realizarCombate() {

        inimigo = InimigoFactory.criaRandom();
        System.out.println("Um " + inimigo.getNome() + " aparece.");



        while (inimigo.isAlive() && jogador.isAlive()) {
            realizarAcao();
            jogador.verAtributos();
            inimigo.verAtributos();
        }

        if (jogador.isAlive()) {
            System.out.println(inimigo.getNome() + " morreu.");
        }

    }

    public static void realizarAcao() {
        System.out.println("Você deseja: ");
        System.out.println("1 - Trocar arma.");
        System.out.println("2 - Atacar.");
        int acao = SCANNER.nextInt();
        switch (acao) {
            case 1:
                jogador.setArma(ArmaFactory.criaArma());

            case 2:
                realizarAtaque();
                break;

            default:
                System.out.println("Digite uma opção válida.");
        }
    }

    public static void realizarAtaque() {
        int danoAtaque = jogador.atacar();
        int danoRecebido = inimigo.receberAtaque(danoAtaque);
        jogador.receberAtaque(danoRecebido);


    }

    public static Jogador criaJogador() {
        System.out.println("Digite o nome do personagem");
        String nome = SCANNER.nextLine();
        Arma arma = ArmaFactory.criaArma();
        return new Jogador(nome, arma);
    }


}
