package Jogador;
import Arma.Arma;

public class Jogador {
    private String nome;
    private int vida;
    private Arma arma;
    
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
    
    
    
    
}
