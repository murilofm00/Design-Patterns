import Caixa.VisorApp;
import Caixa.VisorCaixa;
import carrinho.Carrinho;
import item.Item;
import item.ItemSimples;
import item.ItemComposto;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = Carrinho.getInstancia();

        //VisorCaixa view = new VisorCaixa();
        //view.setVisible(true);
        Item i = new ItemSimples("Carne", (float) 19.99);
        System.out.println(i.getNome() +", R$ " + i.getValor());
        Item o = new ItemSimples("Arroz", (float) 23.99);
        System.out.println(o.getNome()+", R$ "+o.getValor());

        ItemComposto io = new ItemComposto("Marmita");
        io.addItem(i);
        io.addItem(o);
        System.out.println(io.getNome()+", R$ "+io.getValor());
        
        carrinho.addVisor(new VisorApp());
        carrinho.addVisor(new VisorCaixa());
        
        carrinho.addItem(i);
        carrinho.addItem(o);
        carrinho.addItem(io);
        carrinho.gerarNota();

        //view.adicionarProduto(i.getNome());
        //view.adicionarProduto(o.getNome());
        //view.adicionarProduto(io.getNome());
    }
}
