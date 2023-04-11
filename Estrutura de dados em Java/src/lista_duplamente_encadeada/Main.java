package lista_duplamente_encadeada;

public class Main {
    public static void main(String[] args){

        ListaDupla<String> minhaListaDupla = new ListaDupla<String>();

        minhaListaDupla.add("c1");
        minhaListaDupla.add("c2");
        minhaListaDupla.add("c3");
        minhaListaDupla.add("c4");
        minhaListaDupla.add("c5");
        minhaListaDupla.add("c6");
        minhaListaDupla.add("c7");
        minhaListaDupla.add("c8");

        System.out.println(minhaListaDupla);
        System.out.println(minhaListaDupla.size());

        minhaListaDupla.remove(3);
        System.out.println(minhaListaDupla);
        System.out.println(minhaListaDupla.get(3));
    }
}
