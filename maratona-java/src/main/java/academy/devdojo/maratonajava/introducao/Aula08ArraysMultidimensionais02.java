package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};// inicializar array multidimensional de outra forma

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-------"); // \n = pular uma linha
            for (int num : arrayBase) {
                System.out.print(num + " "); // ln sempre imprime na proxima linha
            }
        }
    }
}
