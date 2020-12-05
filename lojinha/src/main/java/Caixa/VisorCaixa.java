package Caixa;
public class VisorCaixa implements Visor{

    @Override
    public void addItem(String item, float valor) {
        System.out.println("Compra em aberto:");
        System.out.println("O item: " + item + " no valor de R$ " + valor + " foi adicionado");
    }
    
}
