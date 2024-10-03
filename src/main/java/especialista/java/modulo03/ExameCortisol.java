package especialista.java.modulo03;

import java.util.Scanner;

public class ExameCortisol {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cortisol: ");
        double cortisol = entrada.nextDouble();

        //cortisol ideal é de 6 a 18.4
        //AND
        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
        System.out.printf("Cortisol normal: %b%n", resultadoNormal);

        //OR
        boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;
        System.out.printf("Cortisol Anormal: %b%n", resultadoAnormal);
    }
}
