package Inimigo;

import Arma.Arma;

public abstract class Inimigo {
    private int vida;
    private String nome;
    private Arma arma;
    private int armadura;

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

    public int getArmadura() {
        return armadura;
    }

    protected void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    private boolean isAlive() {
        return this.vida > 0;
    }

    public int receberAtaque(int danoRecebido) {
        int danoAtaque = 0;
        defender(danoRecebido);
        if(isAlive()) {
            movimentar();
            danoAtaque = atacar();
        }
        return danoAtaque;
    }

    protected void receberDano(int danoRecebido) {
        this.vida = this.vida - danoRecebido;
    }

    protected abstract void defender(int danoRecebido);

    public void movimentar() {
        System.out.println("O " + getNome() + " se reposiciona");
    }

    public int atacar() {
        return arma.atacar();
    }
}
