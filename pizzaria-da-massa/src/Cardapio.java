
public class Cardapio {
    
    private String sabor;
    private double preco;
    private int cont;
    private double total;
    private String pedidos;

    public Cardapio(String sabor, double preco, int cont) {
        this.cont = cont;
        this.sabor = sabor;
        this.preco = preco;
    }
    
    public Cardapio() {}

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void setPedidos(String pedidos){
        this.pedidos = pedidos;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    //imprime o cardápio
    public String toString() {
        String s = "";
        if(sabor != null){
            s += cont + " - " + sabor;
            s += ", preço R$: " + preco;
        }
        return s;
    }

    //imprime pedidos e o valor total da compra
    public String imprimirPedido(){
        String s = "";
        if(pedidos != null){
            s += "Pedido: " + pedidos;
            s += "\u001b[1m Valor total R$: \u001b[m" + total;
        }        
        return s;
    }    
    
}
