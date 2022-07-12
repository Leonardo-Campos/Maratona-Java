package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game no Life", 2.99),
            new LightNovel("Fullmetal Alchimist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
//        lightNovels.stream().forEach(System.out::println); o ideal é fazer da forma abaixo para não disperdiçar processamento
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = stream.filter(ln -> ln.getPrice() <= 4).count();
        long count1 = lightNovels.stream().distinct().filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(count);
        System.out.println(count1);
    }

}
