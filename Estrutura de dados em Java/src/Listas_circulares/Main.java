package Listas_circulares;

public class Main {

    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("C0");

        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);

        System.out.println(minhaListaCircular);

        minhaListaCircular.add("C0");
        minhaListaCircular.add("C1");
        minhaListaCircular.add("C2");

        System.out.println(minhaListaCircular);

        System.out.println(minhaListaCircular.get(1));
    }
}
