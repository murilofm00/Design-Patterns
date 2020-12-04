import javax.swing.*;

public class VisorCaixa extends JFrame{
    private JList listaCompras;
    private JTextField totalField;
    private JPanel painel;
    private DefaultListModel<String> listaItens = new DefaultListModel<>();

    public VisorCaixa(){
        setTitle("Caixa");
        setSize(500,500);
        add(painel);
        listaCompras.setModel(listaItens);
    }

    public void adicionarProduto(String item) {
        listaItens.addElement(item);
    }
}
