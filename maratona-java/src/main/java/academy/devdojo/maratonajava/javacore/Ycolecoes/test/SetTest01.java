package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>(); // Set não permite elementos duplicados, e os elementos serão organilzados pelo Hash
        mangas.add(new Manga(5L, "Attack on Titan", 19.9,0));
        mangas.add(new Manga(1L, "Berserk", 9.5,5));
        mangas.add(new Manga(4L, "Helssing", 3.2,0));
        mangas.add(new Manga(3L, "Pokemon", 11.2,2));
        mangas.add(new Manga(2L, "Dragon Ball", 2.99,0));
        mangas.add(new Manga(2L, "Dragon Ball", 2.99,0)); // não insere o valor porque não duplica

        for(Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
