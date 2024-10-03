package especialista.java.modulo02;

public class PromocaoAritimetica {
    public static void main(String[] args) {
        int x = 10;
        long y = 5;
        //int z = x * y; //A atribuição para int Não compila, pois operações entre tipos diferentes
        //a atribuição so acontece se o tipo da variavel de atribuição for do tipo maior (Ex:long)
        //System.out.println(z);

        //PROMOCAO ARIRIMETICA
        //resultam no tipo maior, neste caso o long, PROMOCAO ARIRIMETICA
        int a = 10;
        long b = 5;
        long c = 10 + 5;
        System.out.println(a + b);
    }
}
