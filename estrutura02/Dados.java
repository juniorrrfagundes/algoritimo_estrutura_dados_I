package estrutura02;

public class Dados {
    private int valor;
    public void setValor(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return this.valor;
    }
    public String toString(){
        return this.getValor()+"";
    }
}
