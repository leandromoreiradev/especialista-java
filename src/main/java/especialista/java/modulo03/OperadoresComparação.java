package especialista.java.modulo03;

public class OperadoresComparação {
    public static void main(String[] args) {
        int pesoProdutos = 900;
        int limitePesoCaminhao = 1000;

//        boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;
//        System.out.printf("Carga excedida: %b%n", cargaExcedida);
//
//        boolean cargaLiberada = pesoProdutos < limitePesoCaminhao;
//        System.out.printf("Carga liberada: %b%n", cargaLiberada);

        boolean cargaExcedida = pesoProdutos >= limitePesoCaminhao;
        System.out.printf("Carga excedida: %b%n", cargaExcedida);

        boolean cargaLiberada = pesoProdutos <= limitePesoCaminhao;
        System.out.printf("Carga liberada: %b%n", cargaLiberada);
    }
}
