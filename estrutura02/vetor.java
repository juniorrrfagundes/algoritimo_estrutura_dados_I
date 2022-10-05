package estrutura02;

public class vetor {
    private Dados[] dados = new Dados[100];
    private int total = 0;

    public void AdicionarDados(Dados elemen){
        this.dados[this.total] = elemen;
        this.total++;
    }

    public String toString(){
        String str="[";
        int maiorValor = 0;
        for(int i=0; i<=total-1; i++){
            maiorValor = Math.max(dados[i].getValor(), maiorValor);
        }
        int menorValor = maiorValor;
        for(int i=0; i<=total-1; i++){
            menorValor = Math.min(dados[i].getValor(), menorValor);
        }
        str += maiorValor+","+menorValor+"]";
        return str;
    }
}
