package list;

/* Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
 (nome - idade - cor);

 Gato 1 = nome: Jon, idade: 18, cor: preto
 Gato 2 = nome: Simba, idade: 6, cor: tigrado
 Gato 3 = nome: Jon, idade: 12, cor: amarelo */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<Gato>(){{
            add(new Gato("Jon", "preto", 18));
            add(new Gato("Simba","tigrado", 6));
            add(new Gato("Jon","amarelo", 12));
            add(new Gato("Abu","roxo", 1));
            add(new Gato("Ravi","elo", 2));
        }};
        System.out.println("Ordem de inserção:");
        System.out.println(meusGatos);

        Collections.shuffle(meusGatos);//bagunça ordem da lista
        System.out.println("Ordem aleatória: ");
        System.out.println(meusGatos);

        System.out.println("Ordem alfabética (nome): "); //tem q usar a interface comparable
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem por idade: ");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private  String cor;
    private Integer idade;

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}