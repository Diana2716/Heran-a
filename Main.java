public class Main {
    public static void main(String[] args) {

        Microondas bat = new Microondas(1, "microondas", "220V", "Branco", 3000);

        System.out.println(bat.getNome());
        bat.setNome("microondas");
        System.out.println(bat.getTensao());
    }
}
