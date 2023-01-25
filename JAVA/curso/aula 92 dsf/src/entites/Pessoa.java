package entites;

public class Pessoa {

    private String cpf;
    private String nome;
    private double altura;

    public Pessoa(String cpf, String nome, double altura) {
        this.cpf = cpf;
        this.nome = nome;
        this.altura = altura;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
