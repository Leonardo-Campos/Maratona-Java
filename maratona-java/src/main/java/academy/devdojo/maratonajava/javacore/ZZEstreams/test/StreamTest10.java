package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);
        //0,1,1,2,3,5,8,13,21,34 - sequencia Fibonatti
        //(0,1) (1,1) (1,2) (2,3) (3,5) (5,8)

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.print(Arrays.toString(a)));

        System.out.println();

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a-> a[0])
                .forEach(System.out::print);

        ThreadLocalRandom randon = ThreadLocalRandom.current();
        Stream.generate(() -> randon.nextInt(1, 500))
                .limit(90)
                .forEach(System.out::println);
    }
}
