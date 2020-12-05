package Caixa;
public class VisorApp implements Visor{

    @Override
    public void addItem(String item, float valor) {
        System.out.println("Notificação do aplicativo!");
        System.out.println("O item: " + item + " no valor de R$ " + valor + " foi adicionado");
    }
    
}

