package estrutura03;

public class Vetor {
    private Dados[] dados = new Dados[100];
    private int total = 0;
    StringBuilder builder = new StringBuilder();

    private boolean posicaoOcupada(int pos) {
        return pos >= 0 && pos < this.total;
    }

    private boolean posicaoValida(int pos) {
        return pos >= 0 && pos <= this.total;
    }

    public void adiciona(Dados elem) {
        this.dados[this.total] = elem;
        this.total++;
    }

    public void adiciona(int pos, Dados elem) {
        if(!posicaoValida(pos))
            throw new IllegalArgumentException("Posição inválida");
        for(int i = total - 1; i >= pos; i--)
            this.dados[i + 1] = this.dados[i];
        this.dados[pos] = elem;
        this.total++;
    }

    public Dados pega(int pos) {
        if(!posicaoOcupada(pos))
            throw new IllegalArgumentException("Posição inválida");
        return this.dados[pos];
    }

    public void remove(int pos) {
        if(!posicaoOcupada(pos))
            throw new IllegalArgumentException("Posição inválida");
        for(int i = pos; i < total - 1; i++)
            this.dados[i] = this.dados[i + 1];
        this.total--;
    }

    public int tamanho() {
        return this.total;
    }
    public boolean contem(String str) {

        return builder.indexOf(str) >= 0 ? true : false ; }

    public String toString() {
        if (this.total == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < this.total - 1; i++) {
            builder.append(this.dados[i]);
            builder.append(", ");
        }
        builder.append(this.dados[this.total - 1]);
        builder.append("]");
        return builder.toString();
    }
}