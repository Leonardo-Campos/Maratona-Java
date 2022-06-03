package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == != (true or false)

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezigualVinte = 10 == 20;
        boolean isDezigualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezigualVinte "+isDezigualVinte);
        System.out.println("isDezigualDez "+isDezigualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // && (AND) || (OR) ! (NEGAÇÂO)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQue30 = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade <= 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQue30 "+isDentroDaLeiMaiorQue30);
        System.out.println("isDentroDaLeiMenorQue30 "+isDentroDaLeiMenorQue30);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // bonus = bonus + 1000 = 1800
        bonus -= 1000; // bonus = bonus - 1800 = 1000
        bonus *= 2; // bonus = bonus * 2 = 3600
        bonus /= 2; // bonus = bonus / 2 = 1800

        System.out.println(bonus);

        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador ++;
        contador --;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);

    }
}
