package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodosGenericosTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);

    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);

    }

//    private static <T extends Comparable> List<T> criarArrayComUmObjeto(T t){
//        return List.of(t);
//
//    }
}

