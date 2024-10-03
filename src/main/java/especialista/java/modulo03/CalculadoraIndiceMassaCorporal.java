package especialista.java.modulo03;

import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Peso: ");
        int peso = entrada.nextInt();
        System.out.println("Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        boolean abaixoPesoIdeal = imc < 18.5;
        if (abaixoPesoIdeal) {
            System.out.println("Abaixo do peso ideal");
        } else {
            System.out.println("Acima do peso");
        }


    }
}