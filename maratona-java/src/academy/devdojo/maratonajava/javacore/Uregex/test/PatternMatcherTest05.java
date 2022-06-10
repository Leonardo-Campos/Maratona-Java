package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // metacaracter \d = retorna todos os digitos
        // metacaracter \D = Tudo que não for digito
        // metacaracter \s = Espaços em branco \t \n \f \r
        // metacaracter \S = Excluindo os brancos
        // metacaracter \S = Excluindo os brancos
        // metacaracter \w = a-z ou A-Z, digitos, _
        // metacaracter \W = tudo o que não for incluso no \w
        // metacaracter "range" []
        //metacaracter ? = zero ou uma ocorrencia
        //metacaracter * = zero ou mais ocorrencia
        //metacaracter + = uma ou mais ocorrencia
        //metacaracter {n,m} = n até m
        //metacaracter () = agrupamento
        //metacaracter | = ou - o(v|c)o ovo | oco
        //metacaracter $ = fim da linha
        //metacaracter . = 1.3 = 123, 133, 1@3, 1A3


        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@zoro@gmail.com, teste@gmail.com.br, sakura@mail";
        System.out.println("E-mail valido");
        System.out.println("#@zoro@gmail.com".matches(regex));
        System.out.println(Arrays.toString(text.split(",")));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text:   "+text);
        System.out.println("Indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");

        }

    }
}
