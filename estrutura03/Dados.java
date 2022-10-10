package estrutura03;

public class Dados {
    private String text;
    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return this.text;
    }
    public String toString(){
        return this.getText();
    }
}