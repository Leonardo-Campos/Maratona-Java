package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // metacaracter \d = retorna todos os digitos
        // metacaracter \D = Tudo que não for digito
        // metacaracter \s = Espaços em branco \t \n \f \r
        // metacaracter \S = Excluindo os brancos
        // metacaracter \S = Excluindo os brancos
        // metacaracter \w = a-z ou A-Z, digitos, _
        // metacaracter \W = tudo o que não for incluso no \w
        // metacaracter "range" []

//        String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
//        String text = "cafeBABE";
        String text2 = "12 0x 0x 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("text:   "+text2);
        System.out.println("Indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");

        }
        int numeroHexadecimal = 0X59F86A; // para digitar diretamente precisamos inserir 0x
        System.out.println(numeroHexadecimal);
    }
}
