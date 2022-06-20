package academy.devdojo.maratonajava.javacore.Ycolecoes.test;


import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList(16); // feito até a versão 1.4
        List<String> nomes2 = new ArrayList(16);
        nomes.add("William");
        nomes.add("Devdojo Academy");
        nomes2.add("Goku");
        nomes2.add("Vegeta");

        nomes.addAll(nomes2);
        for(String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("--------");
        int size = nomes.size();
        for(int i = 0; i < size; i++){
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
