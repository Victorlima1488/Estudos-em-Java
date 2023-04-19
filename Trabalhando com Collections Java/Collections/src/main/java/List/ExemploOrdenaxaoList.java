package List;

import java.util.*;

/* Dadas as seguuintes informações sobre meus fatos, crie uma lista e ordene esta lista exibindo:
    (nome - idade cor)

List.Gato 1 = nome: Jon, idade: 18, cor: preto
List.Gato 2: nome: Simba, idade: 6, cor: tigrado
gato 3: nome: Jon, idade: 12, cor: amarelo
*/
public class ExemploOrdenaxaoList {
    public static void main(String[] args){

        List<Gato> meusGatos = new ArrayList<>();

        meusGatos.add(new Gato("Jon", 18, "preto"));
        meusGatos.add(new Gato("Simba", 6, "tigrado"));
        meusGatos.add(new Gato("Jon", 12, "amarelo"));

        System.out.println("--\t Ordem de Inserção\t--");
        System.out.println(meusGatos);

        System.out.println("--\tOrem aleatória \t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
//
        System.out.println("--\tOrem natural \t--");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
//
        System.out.println("--\tOrem Idade \t--");
//        Collections.sort(meusGatos, new CompraratorIDade());
        meusGatos.sort(new CompraratorIdade());
        System.out.println(meusGatos);
        /*  */
        System.out.println("--\tOrem cor \t--");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrem Nome/Cor/Idade \t--");
        Collections.sort(meusGatos, new ComparatorNomeCorIDade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "List.Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
class CompraratorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIDade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}