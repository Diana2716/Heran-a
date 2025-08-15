public class Batedeira extends Eletrodomesticos{

    private int potencia;

    public Batedeira(int potencia, String nome, String tensao, String cor, int preco) {
        super(nome, tensao, cor, preco);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
