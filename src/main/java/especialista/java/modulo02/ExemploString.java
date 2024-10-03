package especialista.java.modulo02;

public class ExemploString {
    public static void main(String[] args) {
        System.out.println("Fala, mergulhador");
        int x = 10;
        int y = 5;
        //int z = x + y;

        System.out.println("Resultado: " + (x + y)); // vai somar pois a ordem de precendencia é a operação dentro do parentesis
        System.out.println("Resultado: " + x + y); //vai concatenar pois o compilado enxergou primeiro a string

        //Declarando variavel do tipo String
        String nome = "Maria";
        int idade = 30;
        System.out.println(nome + " tem " + idade + " anos");



    }
}
