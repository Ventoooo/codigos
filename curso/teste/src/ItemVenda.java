public class ItemVenda extends Produto {
    public int quantidade;

    public int getQuantidade(){
        return this.quantidade;
    }
    public int setCpf(int quantidade){
        return this.quantidade = quantidade;
    }

    public double CalcularTotal(){
        double CalcularTotal = getPrice()*quantidade;
        return CalcularTotal;
    }

    public ItemVenda(String name, double price, int quantidade){
        super(name, price);
        this.quantidade = quantidade;
    }
}
