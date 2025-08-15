public class Microondas extends Eletrodomesticos{

    private int capacidade;

    public Microondas(int capacidade, String nome, String tensao, String cor, int preco) {
        super(nome, tensao, cor, preco);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
