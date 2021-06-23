package set;

/* Dadas as seguintes informações sobre minhas séries favoritas,
   crie um conjunto e ordene este conjunto exibindo:
   (nome - genero - tempo de episódio);

   Serie 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
   Serie 2 = Nome: dark, genero: drama, tempoEpisodio: 60
   Serie 3 = Nome: that '70s show, genero: comedia, tempoEpisodio: 25
   */

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("ordem aleatoria");
        Set<Serie> minhasSeries = new HashSet<Serie>(){{
            add(new Serie("got", "fantasia", 60.0));
            add(new Serie("dark", "drama", 60.0));
            add(new Serie("that '70s show", "comédia", 25.0));
        }};

        for(Serie serie : minhasSeries){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
    }
}

class Serie{
    private String nome;
    private String genero;
    private Double tempoEpisodio;

    public Serie(String nome, String genero, Double tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Double getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }
}
