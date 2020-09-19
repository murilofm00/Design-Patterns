package Arma;
public class Pistola implements Arma{
    @Override
    public int atacar(){
        System.out.println("Atacando com pistola");
        return 75;
    }
    
}
