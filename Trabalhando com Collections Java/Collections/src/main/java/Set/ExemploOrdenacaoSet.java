package Set;

import java.util.*;
public class ExemploOrdenacaoSet {
    public static void main(String[] args){
        /*Dadas as seguintes informações sobre minhas séries favoritas,
        crie um conjunto e ordene este conjunto exibindo:
        (nome - genero - tempo de episódio);
        Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
        Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
        Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
        */

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhaSerie = new HashSet<>();
        minhaSerie.add(new Serie("got", "fantasia", 60));
        minhaSerie.add(new Serie("dark", "drama", 60));
        minhaSerie.add(new Serie("that '70s show", "comédia", 60));

        for(Serie serie: minhaSerie) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodeo());

        System.out.println("--\tOrdem inserção\t--");  // Como não é aleatótio, se usa o LinkedHashSet.

        Set<Serie> minhaSerie2 = new LinkedHashSet<>();
        minhaSerie2.add(new Serie("got", "fantasia", 60));
        minhaSerie2.add(new Serie("dark", "drama", 60));
        minhaSerie2.add(new Serie("that '70s show", "comédia", 60));

        for(Serie serie: minhaSerie2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodeo());


        System.out.println("--\tOrdem natural (TempoEpisodio)\t--"); // Para ordem natural, uso o Treeset

        Set<Serie> minhaSeries3 = new TreeSet<Serie>(minhaSerie2);
        for(Serie serie: minhaSeries3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodeo());

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhaSerie4 = new TreeSet<Serie>(new ComparatorNomeGeneroTempoEpisodeo());
        minhaSerie4.addAll(minhaSerie);
        for(Serie serie: minhaSerie4) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodeo());

    }
}

class ComparatorNomeGeneroTempoEpisodeo implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
        if(genero != 0) return genero;

        int nome = s1.getNome().compareToIgnoreCase(s2.getNome());
        if(nome != 0) return nome;

        return Integer.compare(s1.getTempoEpisodeo(), s2.getTempoEpisodeo());
    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodeo;

    public Serie(String nome, String genero, Integer tempoEpisodeo) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodeo = tempoEpisodeo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodeo() {
        return tempoEpisodeo;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodeo=" + tempoEpisodeo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodeo, serie.tempoEpisodeo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodeo);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodeo =  Integer.compare(this.getTempoEpisodeo(), serie.getTempoEpisodeo());
        if (tempoEpisodeo != 0) return tempoEpisodeo;

        return this.getGenero().compareToIgnoreCase(serie.getGenero());
    }
}
