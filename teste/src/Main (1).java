
public class Main{
    public static void main(String[] args) {

        Produto p1 = new Produto("Cerveja", 11.00);
        Produto p2 = new Produto("Donut", 22.00);
        Produto p3 = new Produto("Sanduíche", 33.00);
        Produto p4 = new Produto("Frango Frito", 44.00);


        ItemVenda ItemVenda_01 = new ItemVenda(p1.getName(),p1.getPrice(), 4);
        ItemVenda ItemVenda_02 = new ItemVenda(p2.getName(),p2.getPrice(),  3);
        ItemVenda ItemVenda_03 = new ItemVenda(p3.getName(),p3.getPrice(),  2);
        ItemVenda ItemVenda_04 = new ItemVenda(p4.getName(), p4.getPrice(), 1);

        Cliente Cliente = new Cliente("09845624389" , "Peter Griffin");

        Venda Venda = new Venda(Cliente.getCpf(),Cliente.getName(), "Homer Simpson");


        Venda.adicionarItem(ItemVenda_01);
        Venda.adicionarItem(ItemVenda_02);
        Venda.adicionarItem(ItemVenda_03);
        Venda.adicionarItem(ItemVenda_04);

        Venda.listavenda();
    }

}
