package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !

       if (isAutorizadoComprarBebida != false){
           System.out.println("Autorizado a comprar bebida alcoolica");
       }else{
           System.out.println("Não Autorizado a comprar bebida alcoolica");
       }

       boolean c = false;
       if(c==true){
           System.out.println("Dentro de algo que nunca deve ser feito");
       }
       if (!isAutorizadoComprarBebida){
           System.out.println("Não autorizado");
       }

        System.out.println("Fora do IF");
    }
}
