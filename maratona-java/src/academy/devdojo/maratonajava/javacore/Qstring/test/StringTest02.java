package academy.devdojo.maratonajava.javacore.Qstring.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "    Lufi    ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        int[] nums = {1,2,3};
        System.out.println(nums.length); // length em um array é um atributo
        System.out.println(nome.length()); // length ema string é um metodo por isso usamos ()
        System.out.println(nome.replace('f', 'l'));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(numeros.substring(2,numeros.length())); // o segundo parametro é sempre um a menos do que o que vc quer passar
        System.out.println(nome.trim()); // remove espaços em branco
    }
}
