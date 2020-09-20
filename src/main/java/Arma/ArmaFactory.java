package Arma;

import java.util.Scanner;

public class ArmaFactory {
    private static final String CATALOGO = " 1 - espada," +
            "\n 2 - Pistola," +
            "\n 3 - Arco e Flecha";

    public static Arma criaArma(String arma){
        if(arma.equals("espada")){
            return new Espada();
        }
        else if(arma.equals("arcoflecha")){
            return new ArcoFlecha();
        }
        else if(arma.equals("pistola")){
            return new Pistola();
        }
        else
            return null;
    }

    public static Arma criaArma(Integer arma){
        if(arma.equals(1)){
            return new Espada();
        }
        else if(arma.equals(2)){
            return new ArcoFlecha();
        }
        else if(arma.equals(3)){
            return new Pistola();
        }
        else
            return null;
    }

    public static Arma criaArma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione uma arma:");
        System.out.println(CATALOGO);
        return criaArma(scanner.nextInt());

    }

}
