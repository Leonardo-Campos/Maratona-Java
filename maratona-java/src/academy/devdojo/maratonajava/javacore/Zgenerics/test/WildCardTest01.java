package academy.devdojo.maratonajava.javacore.Zgenerics.test;


import javax.security.auth.callback.CallbackHandler;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {


    @Override
    public void consulta() {
        System.out.println("Consultando Doguin");

    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);
        Animal[] animals = {new Gato(), new Cachorro()};
        printConsulta(animals);

    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
//        animals[1] = new Gato();

    }
}
