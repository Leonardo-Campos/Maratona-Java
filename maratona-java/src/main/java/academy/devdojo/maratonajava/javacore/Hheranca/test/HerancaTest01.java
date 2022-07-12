package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das Dalias");
        endereco.setCep("13232553");

        Pessoa pessoa = new Pessoa("Leonardo Campos");
                pessoa.setCpf("47541053899");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Yoshio");
        funcionario.setCpf("545455");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(21000);

        System.out.println("---------");

        funcionario.imprime();
    }
}
