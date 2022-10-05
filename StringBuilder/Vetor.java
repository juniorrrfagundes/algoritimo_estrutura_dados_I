package StringBuilder;

public class Vetor {
    private Dados[] dados = new Dados[5];
    private int total = 0;

    public void addText(Dados text){
        this.dados[total] = text;
        this.total++;
    }

    public String toString(){
        if(this.total ==0){
            return "[]";
        } else{
            StringBuilder builder = new StringBuilder();
            builder.append("[");
            for(int i=0; i<this.total -1; i++){
                builder.append(this.dados[i]);
                builder.append(",");
            }
            builder.append(this.dados[this.total -1]);
            builder.append("]");
            return builder.toString();
        }
    }
}
