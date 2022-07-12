package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        carro.modelo = "AXW1545";
        carro.nome = "Fiat Uno";
        carro.ano = 2000;

        carro2.modelo = "AYK2522";
        carro2.nome = "Mercedes 180";
        carro2.ano = 2021;

        carro = carro2;

        System.out.println("Modelo: "+carro.modelo+" Nome: "+carro.nome+" Ano: "+carro.ano);
        System.out.println("Modelo: "+carro2.modelo+" Nome: "+carro2.nome+" Ano: "+carro2.ano);
    }
}
