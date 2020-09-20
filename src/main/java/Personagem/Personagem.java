package Personagem;

import Arma.Arma;

public abstract class Personagem {
    private int vida;
    private String nome;
    private Arma arma;

    public int getVida() {
        return vida;
    }

    protected void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public boolean isAlive() {
        return this.vida > 0;
    }

    protected void receberDano(int danoRecebido) {
        this.vida = this.vida - danoRecebido;
    }

    public void movimentar() {
        System.out.println("O " + getNome() + " se reposiciona");
    }

    public int atacar() {
        return arma.atacar();
    }

    public abstract int receberAtaque(int danoRecebido);
}
