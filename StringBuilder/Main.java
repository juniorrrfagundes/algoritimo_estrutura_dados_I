package StringBuilder;

public class Main {
    public static void main(String args[]){
        Dados dado = new Dados();
        dado.setText("Junior");
        Vetor lista = new Vetor();
        lista.addText(dado);
        System.out.println(lista);
    }
}
