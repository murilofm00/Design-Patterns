//Observer
package Caixa;

import item.Item;
import java.util.ArrayList;
import java.util.List;

public class Visores implements Visor{
    private List<Visor> visores = new ArrayList<>();

    @Override
    public void addItem(String item, float valor) {
        for (Visor visor : visores) {
            visor.addItem(item, valor);
        }             
    }
    public void addVisor(Visor visor){
        visores.add(visor);
    }
    
    
}
