package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Attack on Titan", 19.9,0));
        mangas.add(new Manga(1L, "Berserk", 9.5,5));
        mangas.add(new Manga(4L, "Helssing", 3.2,0));
        mangas.add(new Manga(3L, "Pokemon", 11.2,2));
        mangas.add(new Manga(2L, "Dragon Ball", 2.99,0));
        mangas.add(new Manga(10L, "Aaragon", 2.99,0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------");
        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 3.2, 5);

        // lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println("-----");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println("---");

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());


    }
}

// Usar TreeSet quando a classe que está criando a coleção implementa comparable ou um comparator e o Treeset vai organizar baseado no valor do Compareto ou Comparable