package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z"; // at com aspas simples faz com que o SimpleDateFormat ignore
        String pattern1 = "'Brasil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        SimpleDateFormat sdf1 = new SimpleDateFormat(pattern1);
        System.out.println(sdf.format(new Date()));
        System.out.println(sdf1.format(new Date()));

        try {
            System.out.println(sdf1.parse("Brasil 08 de junho de 2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
