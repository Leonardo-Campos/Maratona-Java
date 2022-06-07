package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; // String constant pool
        String nome2 = "William";
        nome = nome.concat(" Suane"); // nome += " Suane"
        System.out.println(nome);
        System.out.println(nome == nome2); // a variavel de referencia está fazendo referencia ao mesmo objeto em memoria William porque String é imutável
        String nome3 = new String("William"); // Quando cria dessa forma, o objeto é criado no heap que encapsula o objeto do pool de strings
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern()); // quando fazemos .intern, nos buscamos a referencia direto no pool de strings
    }
}
