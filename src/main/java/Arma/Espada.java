package Arma;
public class Espada implements Arma{
    @Override
    public int atacar(){
        System.out.println("Atacando com espada.");
        
        return 10;
    }
    @Override
    public String getNome(){
        return "espada";
    }
    
}
