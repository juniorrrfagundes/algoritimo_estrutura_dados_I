package estrutura02;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Dados dado = new Dados();
        vetor lista = new vetor();

        System.out.println("Digite a quantidade itens");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            dado = new Dados();
            System.out.println("Digite a idade");
            int idade = Integer.parseInt(scanner.nextLine());
            dado.setValor(idade);
            lista.AdicionarDados(dado);
        }
        System.out.println(lista);
        System.out.println(lista);
    }
}
