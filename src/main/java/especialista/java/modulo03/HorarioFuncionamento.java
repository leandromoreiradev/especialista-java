package especialista.java.modulo03;

import java.util.Scanner;

public class HorarioFuncionamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia da semana (ex:seg, ter, que, qui, etc:) ");
        String diaSemana = entrada.nextLine();
        System.out.println("Digite o mes ");
        int mes = entrada.nextInt();

        String horarioFuncionamento = "";

//        switch (diaSemana) {
//            case "seg":
//                horarioFuncionamento = "Fechado";
//                break;
//            case "ter":
//            case "qua":
//            case "qui":
//            case "sex":
//            case "sab":
//            case "dom":
//                horarioFuncionamento = "Das 08:00 as 18:00";
//                break;
//            default:
//                horarioFuncionamento = "Opção inválida";
//                break;
//        }


        //Arrow Label apartir do  java 14, nao usamos o break

//        switch (diaSemana) {
//            case "seg" -> horarioFuncionamento = "Fechado";
//            case "ter", "qua", "etc" -> horarioFuncionamento = "Das 08:00 as 18:00";
//            case "sab" -> {
//                System.out.println("Qualquer coisa que vc queira executar");
//                int soma = 1 + 9;
//                System.out.println("Soma: " + soma);
//
//            }
//            default ->  horarioFuncionamento = "Opção inválida";
//
//        }



        //Switch expressions,  colocar o default quando ha possibilidade infinitas
        //yield retorna o valor produzido pela expressao, so pode ser usado nessa condicao

        horarioFuncionamento  =  switch (diaSemana) {
            case "seg" ->  {
              if(mes == 12){
                  yield "Das 08:00 as 16:00";
              }
              yield "Fechado";
            }
            case "ter", "qua", "etc" -> "Das 08:00 as 18:00";
            case "sab" -> "de 08:00 as 12:00";
            default ->  "Opção inválida";

        };


        System.out.println(horarioFuncionamento);

    }

}
