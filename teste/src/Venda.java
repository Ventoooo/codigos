import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Venda extends Cliente {
    private LocalDateTime data = LocalDateTime.parse("2022-11-16");;
    private String atendente;
    public ArrayList<ItemVenda> lista = new ArrayList<>();

    public Venda(String cpf, String name, String atendente){
        super(cpf, name);
        this.atendente = atendente;
    }

    public void setData(LocalDateTime data){
        this.data = data;
    }
    public void setAtendente(String atendente){
        this.atendente = atendente;
    }
    public LocalDateTime getData(){
        return data;
    }
    public String getAtendente(){
        return atendente;
    }

    private double calculartotal(){
        double a = 0;
        for(int l = 0; l < lista.size(); l++){
            a += lista.get(l).getPrice();
        }
        return a;
    }
    public void adicionarItem(ItemVenda item){
        lista.add(item);
    }
    public void listavenda(){
        double a = 0;
        System.out.printf("%nData da Venda: %s", data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.printf("%nCliente: %s | CPF: %s | idade: %d", getName(), getCpf(), CalcularIdade());
        System.out.printf("%nAtendente: %-40s",atendente);
        System.out.printf("%nNome do Produto | Preço | Quantidade | Total");
        System.out.printf("%n-----------------------------------------------------");
        for (int l = 0; l < lista.size(); l++) {
            System.out.printf("%n%-16s|R$%5.2f|%12d| R$%8.2f",
                    lista.get(l).getName(),
                    lista.get(l).getPrice(),
                    lista.get(l).getQuantidade(),
                    lista.get(l).CalcularTotal());
            a += lista.get(l).CalcularTotal();
        }
        System.out.printf("%n-----------------------------------------------------");
        System.out.printf("%nTotal da Venda:%34.2f", a);
    }
}
