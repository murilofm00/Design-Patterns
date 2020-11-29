import item.Item;
import item.ItemSimples;
import item.ItemComposto;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        
        Item i = new ItemSimples("Carne", (float) 19.99);
        System.out.println(i.getNome() +"," + i.getValor());
        Item o = new ItemSimples("Arroz", (float) 23.99);
        System.out.println(o.getNome()+","+o.getValor());
    
        ItemComposto io = new ItemComposto("Marmita");
        io.addItem(i);
        io.addItem(o);
        System.out.println(io.getNome()+","+io.getValor());
    }
}
