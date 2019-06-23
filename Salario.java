import java.util.ArrayList;
import java.util.Scanner;

public class Salario{
    static Scanner input = new Scanner(System.in);

    public static void lancaponto(ArrayList<Funcionario> list){
       System.out.print("Digite o id do funcionario:");
       int auxilid = input.nextInt();
       System.out.print("Digite o dia atual:");
       int dia = input.nextInt();
       System.out.print("Digite o mes atual:");
       int mes = input.nextInt();
       System.out.print("Digite o ano atual com 4 digitos:");
       int ano = input.nextInt();
       System.out.print("Digite o numero de horas trabalhadas nessa data:");
       int horastrabal = input.nextInt();
       int auxfuncposition;
       for (int i = 0; i < list.size(); i++) {
           if (list.get(i).getId()==auxilid) {
               auxfuncposition = i;
               break;
           }
       }
       double auxsalary = 0;
       if(horastrabal>=8){
           auxsalary += (list.get(auxfuncposition).getSalarioBase()*(horastrabal-8) + list.get(auxfuncposition).getSalarioBase()*8*1.5);
       } else {
           auxsalary += list.get(auxfuncposition).getSalarioBase()*horastrabal;
       }
       double auxsalariototal = list.get(auxfuncposition).getSalarioTotal() + auxsalary;
       list.get(auxfuncposition).setSalarioTotal(auxsalariototal);
    }
}