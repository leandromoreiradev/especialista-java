package especialista.java.modulo02;

public class ConversaoIntParaLong {
    public static void main(String[] args) {
        int x = 102344;
        int y = (int) x;
        System.out.println(x);
        System.out.println(y);

        //Em uma conversao de int para double é feito automatico pois
        //um tipo int 32bits cabe dentro de um tipo long 64bits
    }
}
