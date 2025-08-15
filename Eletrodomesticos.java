public class Eletrodomesticos {

    private String nome;
    private String tensao;
    private String cor;
    private int preco;

    public Eletrodomesticos(String nome, String tensao, String cor, int preco) {
        this.nome = nome;
        this.tensao = tensao;
        this.cor = cor;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}