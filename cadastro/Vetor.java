package cadastro;

public class Vetor {
    private Dados[] dados = new Dados[5];
    private int total = 0;
    StringBuilder builder = new StringBuilder();

    // Incluir
    public void addObject(Dados object){
        this.dados[total] = object;
        this.total++;
    }

    // Pesquisar elemento
    public Dados search(int index){
        return this.dados[index];
    }

    // Excluir elemento
    public void delete(int index){
        for(int i = index; i < total -1; i++){
            this.dados[i] = this.dados[i +1];
        }
        this.total--;
    }

    // Altera elemento
    public void updateObject(int index, Dados object){
        for (int i = total -1; i>=index; i--){
            this.dados[i +1] = this.dados[i];
        }
        this.dados[index] = object;
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
