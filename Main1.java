public class Main1 {
    public static void main(String[] args) {

        Engenheiro eng = new Engenheiro("Gabriel", 7000, "42527852X", 547821);

        System.out.println(eng.getNome());
        eng.setNome("Lucas");
        System.out.println(eng.getNumCrea());

    }
}