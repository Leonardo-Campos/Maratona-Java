package academy.devdojo.maratonajava.javacore.Rdatas;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1654610731820L);// long 10000
        date.setTime(date.getTime() + 3_600_000); // adicionando 1 hora
        System.out.println(date);
    }
}
