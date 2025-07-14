package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturaCondicionaisExercicio {
    public static void main(String[] args) {
     /*
    Realize um algoritmo que informa a taxa de imposto da Holanda para pessoas que não atingiram a idade de aposentadoria estatal.
    A pessoa deve informa o salário anual.
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, Digite o seu salário anual: ");
        double anualSalarie = Double.parseDouble(scanner.nextLine());
        double taxe;
        if (anualSalarie <= 38441) {  //não colocar ponto sem ser porcentagem
            taxe = (35.82 / 100) * anualSalarie;
        } else if (anualSalarie > 38441 && anualSalarie <= 76817) {
            taxe = (37.48 / 100) * anualSalarie;
        } else {
            taxe = (49.50 / 100) * anualSalarie;
        }
        System.out.println("O valor do seu imposto é:" + taxe);
    }
}
