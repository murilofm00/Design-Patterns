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
        String _nome = nome +" ( ";
        for (Item item : itens) {
            _nome+= item.getNome() +", ";
        }
        _nome = _nome.substring(0, _nome.length() -2) + " )";
        return _nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

}
