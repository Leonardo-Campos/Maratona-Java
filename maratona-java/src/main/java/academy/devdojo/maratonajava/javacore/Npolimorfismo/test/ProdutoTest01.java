package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell G15", 6000);
        Tomate tomate = new Tomate("Tomate pera", 8);
        Televisao tv = new Televisao("Sansumg 50\"", 5000);

        // se você não tiver acessando nenhum atributo de classe, voce pode transformar seus métodos em estaticos

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
