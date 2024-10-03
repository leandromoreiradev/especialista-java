package especialista.java.modulo02;

public class FormatandComPrintf {
    public static void main(String[] args) {
        String nome1 = "Thiago";
        System.out.printf("Olá, %s\n", nome1);

        int quantidade = 48;
        System.out.printf("Quantidade: %d", quantidade);

        double peso = 938.22;
        System.out.printf("Peso: %.2f\n", peso);
    }
}
