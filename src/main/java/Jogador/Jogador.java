package Jogador;
import Arma.*;


public class Jogador {
    private String nome;
    private int vida = 100;
    private Arma arma;
    
    public Jogador(String nome, String arma) {
        this.nome = nome;
        this.arma = ArmaFactory.criaArma(arma);      
    }
    
    public int atacar(){
        return arma.atacar();
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }
    
    public Arma getArma() {
        return arma;
    }
    
    public void setArma(Arma arma) {
        this.arma = arma;
    }
   
    public void verAtributos(){
        System.out.println("Nome = " +nome);
        System.out.println("Vida = " +vida);
        System.out.println("Arma = " +arma.getNome());
    }
    
    
    
}
