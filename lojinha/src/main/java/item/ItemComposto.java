package item;

import java.util.ArrayList;
import java.util.List;

public class ItemComposto implements Item{
    private int codigo;
    private String nome;
    
    private List<Item> itens = new ArrayList<>();     
    
    public ItemComposto(String nome){
        setNome(nome);
    }
    public void addItem(Item item){
        itens.add(item);
    }
    public int getCodigo() {
        return codigo;
    }

    public float getValor() {
        float valor = 0;
        for (Item item : itens) {
            valor+= item.getValor();
        }
        return valor;
    }
    
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }
    
}
