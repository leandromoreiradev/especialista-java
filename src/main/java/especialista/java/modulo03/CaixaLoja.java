package especialista.java.modulo03;

import java.util.Scanner;

public class CaixaLoja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Preco dos produtos: ");
        double precoProdutos = entrada.nextDouble();

        System.out.println("Cobrar frete? ");
        boolean cobrarFrete = entrada.nextBoolean();

        double valorFrete = 0;
        if (cobrarFrete) {
            System.out.println("Valor do frete?");
            valorFrete = entrada.nextDouble();
        }

        double valotTotal = precoProdutos + valorFrete;
        System.out.printf("O valor é: %s", valotTotal);
    }

}
