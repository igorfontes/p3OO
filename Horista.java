import java.util.ArrayList;
import java.util.Scanner;

public class Horista extends Funcionario{

    private double salariohora;

    public Horista(String nome, String endereco, String tipodefunc, String mododepagto, int id, int idsind, double taxasind, double salariototal, double salariohora, String agendainterval, int agendaday, String agendadayofweek, int contadia){
        super(nome, endereco, tipodefunc, mododepagto, id, idsind, taxasind, salariototal, agendainterval, agendaday, agendadayofweek, contadia);
        this.salariohora = salariohora;
    }

    public double getSalarioBase(){
        return salariohora;
    }

    public void setSalarioBase(double salariohora){
        this.salariohora = salariohora;
    }

    // public static void lancaPonto(ArrayList<Funcionario> list){
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Digite o id:");
    //     int auxid = input.nextInt();
    //     System.out.print("Digite o dia atual:");
    //     int dia = input.nextInt();
    //     System.out.print("Digite o mes atual:");
    //     int mes = input.nextInt();
    //     System.out.print("Digite o ano atual com 4 digitos:");
    //     int ano = input.nextInt();
    //     System.out.print("Digite o numero de horas trabalhadas nessa data:");
    //     int horastrabal = input.nextInt();
    //     calcSalary(list,auxid,horastrabal);
    // }

    // public void calcSalary(ArrayList<Funcionario> list){
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Digite o id:");
    //     int auxilid = input.nextInt();
    //     System.out.print("Digite o dia atual:");
    //     int dia = input.nextInt();
    //     System.out.print("Digite o mes atual:");
    //     int mes = input.nextInt();
    //     System.out.print("Digite o ano atual com 4 digitos:");
    //     int ano = input.nextInt();
    //     System.out.print("Digite o numero de horas trabalhadas nessa data:");
    //     int horastrabal = input.nextInt();
    //     int auxfuncposition;
    //     for (int i = 0; i < list.size(); i++) {
    //         if (list.get(i).getId()==auxilid) {
    //             auxfuncposition = i;
    //             break;
    //         }
    //     }
    //     double auxsalary = 0;
    //     if(horastrabal>=8){
    //         auxsalary += (list.get(auxfuncposition).getSalarioBase()*(horastrabal-8) + list.get(auxfuncposition).getSalarioBase()*8*1.5);
    //     } else {
    //         auxsalary += list.get(auxfuncposition).getSalarioBase()*horastrabal;
    //     }
    //     double auxsalariototal = list.get(auxfuncposition).getSalarioTotal() + auxsalary;
    //     list.get(auxfuncposition).setSalarioTotal(auxsalariototal);

    // }

    // public void calcSalary(ArrayList<Funcionario> list){
    //     return;
    // }

}