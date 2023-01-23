import java.time.LocalDate;
import java.time.Period;

public class Cliente{
    private String cpf;
    private String name;
    private static LocalDate DataNascimento = LocalDate.parse("2001-04-11");

    public String getCpf(){
        return cpf;
    }
    public String getName(){
        return name;
    }
    public void setCpf(String cpf){this.cpf = cpf;}
    public void setName(String name){
        this.name = name;
    }

    public static int CalcularIdade(){
        int CalcularIdade = Period.between(DataNascimento, LocalDate.now()).getYears();
        return CalcularIdade;
    }

    public Cliente(String cpf, String name){
        this.name = name;
        this.cpf = cpf;
    }
}
