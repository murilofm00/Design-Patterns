package Arma;
public class ArmaFactory {
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
    
}
