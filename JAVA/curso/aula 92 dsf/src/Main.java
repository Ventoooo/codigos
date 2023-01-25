import entites.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? :");
        int qtpessoa = sc.nextInt();
        Pessoa[] grupoPessoas = new Pessoa[qtpessoa];

        for(int q = 0; q<grupoPessoas.length;q++){
            System.out.printf("%n Digite o nome da pessoa: ");
            String nome = sc.next();
            System.out.printf("%n Digite o cpf da pessoa: ");
            String cpf = sc.nextLine();
            System.out.printf("%n Digite a altura da pessoa: ");
            double altura = sc.nextDouble();
            grupoPessoas[q] = new Pessoa(cpf, nome, altura);
        }

        for(Pessoa x: grupoPessoas){
            System.out.printf("\n%s", x.getNome());
            System.out.println("teste");
            System.out.println(x.getNome())
            ;
        }

    }
}