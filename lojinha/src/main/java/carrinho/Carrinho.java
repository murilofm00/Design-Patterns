package carrinho;

import Caixa.Visor;
import Caixa.Visores;
import java.util.ArrayList;
import java.util.List;


import item.Item;

public class Carrinho {
    private static Carrinho instancia;

    private List<Item> itens = new ArrayList<>();
    private Visores visores = new Visores();
            
    private Carrinho(){
        System.out.println("novoCarrinho");
    }
    
    public static Carrinho getInstancia() {
        if(instancia == null) {
            instancia = new Carrinho();
        }
        return instancia;
    }

    public void addVisor(Visor visor){
        visores.addVisor(visor);
    }
    
    public void addItem(Item item) {
        itens.add(item);
        visores.addItem(item.getNome(), item.getValor());
    }

    public float getValor() {
        float soma = 0;
        for (Item item:
             itens) {
            soma += item.getValor();
        }
        return soma;
    }

    public void gerarNota() {
        System.out.println("          Lojinha");
        System.out.println("----------------------------------");
        System.out.println("          Produtos");
        System.out.println("----------------------------------");
        gerarListaCompra();
        System.out.println("----------------------------------");
        System.out.println("Total= \t\t\t\t\t"+ getValor());

    }

    public void gerarListaCompra() {
        int posicao = 1;
        for (Item item:
                itens) {
            System.out.println(posicao +". "+ item.getNome()+ "\n\t\t\t\t\t" + item.getValor());
            posicao++;
        }
    }

}
