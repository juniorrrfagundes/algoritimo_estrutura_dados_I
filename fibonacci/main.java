package fibonacci;
import java.util.Scanner;


public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int interation = scanner.nextInt();
        vetor lista = new vetor();
        int n1=1, n2=1;

        for(int i=0; i<=interation-1; i++){
            Dados dado = new Dados();
            if (i < 2){
                dado.setValor(1);
                lista.AdicionarDados(dado);
                continue;
            }
            int valor = n1 + n2;
            n1 = n2;
            n2 = valor;
            dado.setValor(valor);
            lista.AdicionarDados(dado);
        }
        System.out.println(lista);
    }
}
