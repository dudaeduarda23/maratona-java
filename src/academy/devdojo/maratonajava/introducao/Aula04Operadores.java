package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int number01 = 20;
        float number02 = 10;
        float result = number02 / number01;
        System.out.println(result);

        // operadores lógicos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezigualDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte"+isDezMenorQueVinte);
        System.out.println("isDezMenorQueVinte"+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte"+isDezIgualVinte);
        System.out.println("isDezIgualDez"+isDezigualDez);
        System.out.println("isDezDiferenteVinte"+isDezDiferenteVinte);

        //&& (AND) || (OR) ! (NOT)
        int age = 35;
        float salarie = 3500;
        boolean isDentroDaLei = age > 30 && salarie >= 4612;
        System.out.println(isDentroDaLei);


    }
}
