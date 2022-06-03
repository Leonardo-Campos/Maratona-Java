package academy.devdojo.maratonajava.introducao;
/*
Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salario <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Leonardo";
        String endereço = "Avenida Amazonas - N° 2989 - Parque Internacional - Campo Limpo Pta - SP";
        double salario = 2500.55;
        String dataRecebimentoSalario = "27/04/22";

        String relatorio ="Eu "+nome+" morando no endereço "+endereço+" confirmo que recebi o salario de "+salario+", na data "+dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
