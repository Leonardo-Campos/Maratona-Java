package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("O Devdojo é lindo, é o melhor curso do brasilsilsilsil\n Chama no bloquin de notas\ngoku is the best");
            fw.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
