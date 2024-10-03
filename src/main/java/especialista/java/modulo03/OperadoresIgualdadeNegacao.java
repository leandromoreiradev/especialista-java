package especialista.java.modulo03;

public class OperadoresIgualdadeNegacao {
    public static void main(String[] args) {
        //IGUALDADE
        //boolean numerosIguais = 10 == 10;
        //boolean numerosIguais = (4 + 6) == (5 * 2);

        int num1 = 10;
        boolean numerosIguais = num1 == 10;
        System.out.printf("Numeros iguais: %b%n", numerosIguais);
        System.out.printf("Numeros iguais: %b%n", 5 == 5);

        //NEGAÇÂO (unário)
        boolean numerosDiferentes = !numerosIguais;
        System.out.printf("Numeros diferentes: %b%n", numerosDiferentes);

        //DIFERENTE
        int idade = 18;
        System.out.printf("O valor da variavel é diferente de %d? %b", idade, idade != 17);

    }
}
