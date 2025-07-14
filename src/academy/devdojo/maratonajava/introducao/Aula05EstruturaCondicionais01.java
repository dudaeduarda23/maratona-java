package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 18) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }
        System.out.println("Não autorizado");

        int idade = 15;
        boolean isAutorizacaoComprarBebida = idade >= 18;
        if (isAutorizacaoComprarBebida) {
            System.out.println("Autorizado a comprar bebida");
        }
        System.out.println("Não autorizado");

        //Operador de negação (!) - é uma forma de não utilizar elif
        if (!isAutorizacaoComprarBebida) {
            System.out.println("Não autorizado");
        }
        //Duas formas de fazer a mesma coisa
        if (isAutorizacaoComprarBebida == false) {
            System.out.println("Não autorizado");


            //else - caso não
            if (isAutorizacaoComprarBebida) {
                System.out.println("Autorizado a comprar bebida alcólica");
            } else {
                System.out.println("Não autorizado a comprar bebida alcólica");
            }
        }
    }
}
