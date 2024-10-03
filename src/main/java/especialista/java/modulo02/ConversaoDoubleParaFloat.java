package especialista.java.modulo02;

public class ConversaoDoubleParaFloat {
    public static void main(String[] args) {
//        double peso1 = 20.5; //DOUBLE cabe 64bits
//        float peso2 = peso1; // FLOAT cabe 32bis então não compila
//        System.out.println(peso1);
//        System.out.println(peso2);


        double peso3 = 20.10;
        float peso4 = (float) peso3; //Compila mas corre o risco de perder informações
        System.out.println(peso3);
        System.out.println(peso4);

        //Em uma conversao de float para double é feito automatico pois
        //um tipo float 32bits cabe dentro de um tipo double 64bits

    }
}
