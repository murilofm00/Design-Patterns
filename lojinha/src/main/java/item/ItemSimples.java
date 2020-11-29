package item;
public class ItemSimples implements Item{
    private int codigo;
    private float valor;
    private String nome;
    
    public ItemSimples(String nome, float valor){
        
        setNome(nome);
        setValor(valor);
    }

    public int getCodigo() {
        return codigo;        
    }
    private void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }
    private void setValor(float valor){
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    private void setNome(String nome){
        this.nome = nome;
    }
    
    
}
