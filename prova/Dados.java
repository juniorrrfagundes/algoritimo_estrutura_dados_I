package prova;

public class Dados {
    //Toda vez que eu iterar o valor estará em idade
    private int idade;
    private String grupo;
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public String toString(){
        //+"" no final para transformar em string
        return this.getGrupo()+"";
    }

    public void setGupo(String grupo){
        this.grupo = grupo;
    }
    public String getGrupo(){
        return this.grupo;
    }

}
