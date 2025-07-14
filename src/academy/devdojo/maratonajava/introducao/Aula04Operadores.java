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
        System.out.println("isDezMaiorQueVinte" + isDezMenorQueVinte);
        System.out.println("isDezMenorQueVinte" + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte" + isDezIgualVinte);
        System.out.println("isDezIgualDez" + isDezigualDez);
        System.out.println("isDezDiferenteVinte" + isDezDiferenteVinte);

        //&& (AND) || (OR) ! (NOT)
        int age = 35;
        float salarie = 3500;
        boolean isDentroDaLei = age > 30 && salarie >= 4612;
        System.out.println(isDentroDaLei);

        // Operadores de atribuição += -= *= /= %= (resto)
        double bonus = 1800;
        bonus = bonus + 1000;
        System.out.println(bonus);

        double bonus1 = 1800;
        bonus1 += 1000;
        bonus1 -= 1000;
        bonus1 *= 2;
        bonus1 /= 2;
        bonus1 %= 2;
        System.out.println(bonus1);

        //Atribuição unitária ++
        int contador = 0;
        contador += 1;
        contador++;
        System.out.println(contador);

        //A ordem da atribuição tem importância
        int contador1 = 0;
        System.out.println(contador1++); // se a atribuição vem depois da variável,primeiro realiza o system.out e depois adiciona o 1. que não aparece junto na saída,
        // só se adicionar mais um system out.
        System.out.println(contador1);
        // Caso seja antes da variável, primeiro ele incrementa e depois executa.
    }
}

