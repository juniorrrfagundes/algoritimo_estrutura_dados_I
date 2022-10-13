package cadastro;

public class Dados {
    private String nome;
    private String cidade;
    private int idade;
    private String telefone;

    // CUIDADO AQUI
    public String toString(){
        return this.returnObject();
    }
    public String returnObject(){
        return
        this.getNome()+","+
        this.getCidade()+","+
        this.getIdade()+","+
        this.getTelefone();
    }

    // Definindo variáveis de Nome;
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    // Definindo variáveis de cidade
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getCidade(){
        return this.cidade;
    }
    
    // Definindo variáveis de idade (Lembrar de converter para String)
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    // Definindo variáveis de telefone
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }
}
