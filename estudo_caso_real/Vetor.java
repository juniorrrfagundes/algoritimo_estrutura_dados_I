package prova;

public class Vetor {
    private Dados[] dados = new Dados[100];
    private int total = 0;

    public void AdicionarDados(Dados elemen){
        this.dados[this.total] = elemen;
        this.total++;
    }

    public String toString(){
        String str="[";
        for(int i=0; i<=total-1; i++){
            if(dados[i] != null){
                str += dados[i]+",";
            }
        }
        return str.substring(0,str.lastIndexOf(",")).trim()+"]";
    }
}
