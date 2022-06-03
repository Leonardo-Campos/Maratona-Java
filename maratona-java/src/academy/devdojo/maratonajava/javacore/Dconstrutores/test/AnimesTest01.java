package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimesTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haykyuu","TV", 12, "ação", "Konami");
        anime.imprime();
    }
}
