package Set;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<arcoiris> arcoiris = new HashSet<>(){{
            add(new arcoiris("Verde"));
            add( new arcoiris("Vermelho"));
            add(new arcoiris("Rosa"));
            add(new arcoiris("Azul"));
            add(new arcoiris("Laranja"));
            add(new arcoiris("Amarelo"));
        }};

        System.out.println("-----Cores do arco-íris: ");
        for(arcoiris cores: arcoiris) System.out.println(cores);

        System.out.println("-----Quantidade de cores que o arco-íris tem: " + arcoiris.size());
//
        System.out.println("-----Exibir as cores em ordem de inserção");
        Set<arcoiris> arcoiris2 = new LinkedHashSet<>();
        arcoiris2.add((new arcoiris("Verde")));
        arcoiris2.add(new arcoiris("Vermelho"));
        arcoiris2.add((new arcoiris("Rosa")));
        arcoiris2.add((new arcoiris("Azul")));
        arcoiris2.add((new arcoiris("Laranja")));
        arcoiris2.add((new arcoiris("Amarelo")));

        for(arcoiris cor: arcoiris2) System.out.println(cor);


        System.out.println("-----Exibir as cores em ordem de alfabética");
        Set<arcoiris> arcoiris3 = new TreeSet<>(arcoiris2);
        for(arcoiris cor: arcoiris3) System.out.println(cor);

        System.out.println("-----Exibir todos as cores que começam com a letra 'V'");
        for(arcoiris cor: arcoiris3) cor.StartWith("V");

//        System.out.println("-----Remover todos as cores que começam com a letra 'V'");


        System.out.println("-----Limpe o conjunto");
        arcoiris3.clear();
        System.out.println(arcoiris3);

        System.out.println("-----Conjuntos está vazio? " + arcoiris3.isEmpty());
    }
}

class arcoiris implements Comparable<arcoiris>{
    private String cores;

    public void StartWith(String letra){
        if(this.getCores().startsWith(letra)) System.out.println(this.getCores());
        System.out.print("");
    }

    @Override
    public String toString() {
        return "arcoiris{" +
                "cores='" + cores + '\'' +
                '}';
    }

    public arcoiris(String cores) {
        this.cores = cores;
    }

    public String getCores() {
        return cores;
    }

    @Override
    public int compareTo(arcoiris cor) {
        return this.getCores().compareToIgnoreCase(cor.getCores());
    }
}
