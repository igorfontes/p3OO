import java.util.Scanner;
import java.util.ArrayList;

public class Comissioned extends Funcionario{

    private double salariocommensal;
    private double percentcomis;

    public Comissioned(String nome, String endereco, String tipodefunc, String mododepagto, int id, int idsind, double taxasind, double salariototal, double salariocommensal, double percentcomis, String agendainterval, int agendaday, String agendadayofweek){
        super(nome, endereco, tipodefunc, mododepagto, id, idsind, taxasind, salariototal, agendainterval, agendaday, agendadayofweek);
        this.salariocommensal = salariocommensal;
        this.percentcomis = percentcomis;
    }

    public double getSalarioBase(){
        return salariocommensal;
    }

    public void setSalarioBase(double salariocommensal){
        this.salariocommensal = salariocommensal;
    }

    // public void lancaVenda(){
    //     Double auxvenda;
    //     System.out.print("Digite o id:");
    //     auxid = input.nextInt();
    //     System.out.print("Digite o dia atual:");
    //     auxdia = input.nextInt();
    //     System.out.print("Digite o mes atual:");
    //     auxmes = input.nextInt();
    //     System.out.print("Digite o ano atual com 4 dígitos:");
    //     auxano = input.nextInt();
    //     System.out.print("Digite o valor da venda:");
    //     auxvenda = input.nextDouble();
    //     Funcionario.setSalarioTotal(Funcionario.getSalarioTotal() + auxvenda*percentcomis);
    //     //salariototal += auxvenda*percentcomis;
    // }

    // public void calcSalary(ArrayList<Funcionario> list){
    //     int auxsalary = 0;
    //     auxsalary += salariocommensal;
    //     //Funcionario.setSalarioTotal(Funcionario.getSalarioTotal() + auxsalary);
    // }

}