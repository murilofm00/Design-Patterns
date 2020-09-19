package Arma;
public class ArcoFlecha implements Arma{
    @Override
    public int atacar(){
        System.out.println("Atacando com Arco e Flecha.");
        return 60;
    } 
    
}
