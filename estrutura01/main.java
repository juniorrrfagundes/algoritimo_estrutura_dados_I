package aula01;

public class main {
    public static void main(String[] args){
        Dados dado = new Dados();
        dado.setName("junior");
        vetor lista = new vetor();
        lista.AdicionarDados(dado);
        System.out.println(lista);
    }
}
