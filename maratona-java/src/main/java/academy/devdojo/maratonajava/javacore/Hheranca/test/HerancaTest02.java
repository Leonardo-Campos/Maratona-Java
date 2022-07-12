package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {

    // 0- Bloco de inicialização estático da superclasse é executado quando a JVM carregar a classe pai
    // 1- Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha
    // 2- alocar o espaço em memoria pro objeto da superclasse
    // 3- Cada um dos atributos da superclasse é criado e inicializado com valores default ou o que for passado da superclasse
    // 4- bloco de inicialização da superclasse executado na ordem em que aparece
    // 5- construtor da superclasse é executado

    // 2- alocar o espaço em memoria pro objeto da subclasse
    // 3- Cada um dos atributos da subclasse é criado e inicializado com valores default ou o que for passado da subclasse
    // 4- bloco de inicialização da subclasse executado na ordem em que aparece
    // 5- construtor da subclasse é executado

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Léozin");
    }
}
