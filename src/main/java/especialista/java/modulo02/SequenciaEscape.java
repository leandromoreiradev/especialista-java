package especialista.java.modulo02;

public class SequenciaEscape {
    public static void main(String[] args) {
        //Para implrimir o "" como um texto da string devemos fazer assim:
        System.out.println("\"Oi Maria\""); //envolvemos o conteudo da string com " \" <CONTEUDO_DA_STRING>  \" "
        System.out.println("{\"nome\":\"Leandro\" ,\"idade\":30}");
        System.out.println("Seu nome:\nJoao"); //quebra de linha
        System.out.println("C:\\Windows\\folder");
        System.out.println("\"Maria\"");
    }
}
