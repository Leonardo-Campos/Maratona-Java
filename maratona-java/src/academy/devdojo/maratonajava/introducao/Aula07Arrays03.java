package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numero2 = {1,2,3,4,5};
        int[] numero3 = new int[]{5,4,3,2,1}; // outra forma de inicializar array

        for (int i = 0; i < numero2.length; i++) {
            System.out.println(numero2[i]); 
        }
        for (int num:numero3){ // outro tipo de for = foreach para imprimir arrays
            System.out.println(num);
        }

    }
}
