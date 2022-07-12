package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // metacaracter \d = retorna todos os digitos
        // metacaracter \D = Tudo que não for digito
        // metacaracter \s = Espaços em branco \t \n \f \r
        // metacaracter \S = Excluindo os brancos
        // metacaracter \S = Excluindo os brancos
        // metacaracter \w = a-z ou A-Z, digitos, _
        // metacaracter \W = tudo o que não for incluso no \w

        String regex = "\\W";
//        String text = "abaaba";
        String text2 = "@#hh_j2 12gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("text:   "+text2);
        System.out.println("Indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");

        }
    }
}
