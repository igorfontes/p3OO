import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Agenda{
    static Scanner input = new Scanner(System.in);
    static LocalDate localdate, auxdate;

    public static void escolheAgenda(ArrayList<Funcionario> list){
        System.out.print("Digite o id do funcionario:\n");
        int auxescolhe = input.nextInt();
        input.nextLine();
        int auxfuncposition = 0;
        int existe = 0; // verifica se o func existe
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()==auxescolhe) {
                auxfuncposition = i;
                existe = 1;
                break;
            }
        }
        if(existe == 0){
            System.out.print("Id nao encontrado (funcionario removido ou nunca adicionado)\n");
        } else {
            System.out.print("Digite o intervalo de pagamento(semanalmente, bi-semanalmente, semanal, mensalmente, mensal ou mensal$(para receber no ultimo dia util do mes)):\n");
            String auxagendainterval = input.nextLine();
            list.get(auxfuncposition).setAgendaInterval(auxagendainterval);
            int auxagendaday;
            switch(auxagendainterval){
                case("semanalmente"):
                break;
                case("bi-semanalmente"):
                break;
                case("semanal"):
                System.out.print("Digite 1 para ser pago toda semana, 2 a cada duas semanas etc:");
                auxagendaday = input.nextInt();
                input.nextLine();
                list.get(auxfuncposition).setAgendaDay(auxagendaday);
                System.out.print("Digite o dia da semana em que deseja ser pago(seg - segunda, ter - terca, qua - quarta, qui - quinta, sex - sexta):");
                String auxagendadayofweek = input.nextLine();
                list.get(auxfuncposition).setAgendaDayofWeek(auxagendadayofweek);
                case("mensalmente"):
                break;
                case("mensal$"):
                break;
                case("mensal"):
                System.out.print("Digite o dia do mes(de 1 a 28) em que deseja ser pago:");
                auxagendaday = input.nextInt();
                list.get(auxfuncposition).setAgendaDay(auxagendaday);
                break;

            }
        }  
    }

    public static void rodaFolha(ArrayList<Funcionario> list){
        System.out.print("Digite o dia atual:");
        int dia = input.nextInt();
        System.out.print("Digite o mes atual:");
        int mes = input.nextInt();
        System.out.print("Digite o ano atual com 4 digitos:");
        int ano = input.nextInt();
		localdate = LocalDate.of(ano,mes,dia); //dia atual digitado pelo usuario
		auxdate = localdate.withMonth(mes).with(TemporalAdjusters.lastDayOfMonth());
		int lastday = auxdate.getDayOfWeek().ordinal();
		while(lastday==5 || lastday==6){ //auxdate passa a ser o ultimo dia util
			auxdate = auxdate.minusDays(1); 
			lastday--;
        }
        //System.out.printf("Ultimo dia util: %s",auxdate);
        for (int i = 0; i < list.size(); i++) {

            //incrementa salario dia a dia
            switch(list.get(i).getTipoDeFunc()){
                case("a"):
                list.get(i).setSalarioTotal(list.get(i).getSalarioTotal()+(list.get(i).getSalarioBase())/30);
                break;
                case("c"):
                list.get(i).setSalarioTotal(list.get(i).getSalarioTotal()+(list.get(i).getSalarioBase())/30);
                break;
            }

            switch(list.get(i).getAgendaInterval()){
                case("mensalmente"):
                if(auxdate.isEqual(localdate)){ //se hoje for o ultimo dia util
                    list.get(i).setSalarioTotal(list.get(i).getSalarioTotal()-list.get(i).getTaxaSind());
                    System.out.printf("O funcionario com id %d recebeu %.2f reais hoje\n", list.get(i).getId(), list.get(i).getSalarioTotal());
                    list.get(i).setSalarioTotal(0.0);
                }
                break;
                case("mensal$"):
                if(auxdate.isEqual(localdate)){ //se hoje for o ultimo dia util
                    list.get(i).setSalarioTotal(list.get(i).getSalarioTotal()-list.get(i).getTaxaSind());
                    System.out.printf("O funcionario com id %d recebeu %.2f reais hoje\n", list.get(i).getId(), list.get(i).getSalarioTotal());
                    list.get(i).setSalarioTotal(0.0);
                }
                break;
                case("mensal"):
                if(list.get(i).getAgendaDay() == dia){ 
                    list.get(i).setSalarioTotal(list.get(i).getSalarioTotal()-list.get(i).getTaxaSind());
                    System.out.printf("O funcionario com id %d recebeu %.2f reais hoje\n", list.get(i).getId(), list.get(i).getSalarioTotal());
                    list.get(i).setSalarioTotal(0.0);
                }
                break;
                case("semanalmente"):
                if(localdate.getDayOfWeek().ordinal() == 4){ //se for sexta, paga
                    list.get(i).setSalarioTotal(list.get(i).getSalarioTotal()-list.get(i).getTaxaSind());
                    System.out.printf("O funcionario com id %d recebeu %.2f reais hoje\n", list.get(i).getId(), list.get(i).getSalarioTotal());
                    list.get(i).setSalarioTotal(0.0);    
                }
                break;
                case("bi-semanalmente"):
                break;
                case("semanal"):
                break;

            }
        }

    }

}