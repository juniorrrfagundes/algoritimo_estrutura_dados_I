package estrutura03;

public class Main {
    public static void main(String args[]){
        Dados dado = new Dados();
        dado.setText("Junior");
        Vetor lista = new Vetor();
        lista.adiciona(0,dado);
        System.out.println(lista);
        System.out.println(lista.pega(0));
        lista.remove(0);

        System.out.println(lista);
    }
}
