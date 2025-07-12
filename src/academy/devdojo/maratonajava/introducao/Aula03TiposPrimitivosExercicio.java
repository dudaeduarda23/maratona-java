package academy.devdojo.maratonajava.introducao;
/*
Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Eduarda";
        String adress = "Rua leonel Azevedo";
        double salarie = 2000;
        String dateReceivedSalarie = "10/07/2025";
        //Uma opção para saída de dados
        //String report = " Eu " + name + " , morando no endereço " + adress + " , confirmo que recebi o salário de " + salarie + " , na data " + dateReceivedSalarie;
        System.out.println(" Eu " + name + " , morando no endereço " + adress + " , confirmo que recebi o salário de " + salarie + " , na data " + dateReceivedSalarie);


    }
}