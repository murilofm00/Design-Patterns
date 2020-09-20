package personagem.Inimigo;
import Util.Random;

public class InimigoFactory {
    public static final String[] INIMIGOS = {"goblin", "guarda"};

    public static Inimigo criaInimigo(String inimigo){
        if(inimigo.equals("goblin")){
            return new Goblin();
        }
        else if(inimigo.equals("guarda")){
            return new Guarda();
        }
        else
            return null;
    }

    public static Inimigo criaRandom(){
        int random = Random.getRandomIntervalo(0, INIMIGOS.length);
        return criaInimigo(INIMIGOS[random]);

    }



}
