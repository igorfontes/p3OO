import java.util.Scanner;
import java.util.ArrayList;

public class Salaried extends Funcionario{

    private double salariomensal;

    public Salaried(String nome, String endereco, String tipodefunc, String mododepagto, int id, int idsind, double taxasind, double salariototal, double salariomensal, String agendainterval, int agendaday, String agendadayofweek){
        super(nome, endereco, tipodefunc, mododepagto, id, idsind, taxasind, salariototal, agendainterval, agendaday, agendadayofweek);
        this.salariomensal = salariomensal;
    }

    public double getSalarioBase(){
        return salariomensal;
    }

    public void setSalarioBase(double salariomensal){
        this.salariomensal = salariomensal;
    }

    // public static void calcSalary(ArrayList<Funcionario> list){
    //     System.out.print("Digite o id do funcionario a lancar ponto:\n");
    //     int auxid = input.nextInt();
    //     int auxsalary = 0;
    //     auxsalary += salariomensal;
    //     //salariototal += auxsalary;
    // }

}