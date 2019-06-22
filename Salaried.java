import java.util.Scanner;

public class Salaried extends Funcionario{

    private double salariomensal;

    public Salaried(String nome, String endereco, String tipodefunc, String mododepagto, int id, int idsind, double taxasind, double salariototal, double salariomensal){
        super(nome, endereco, tipodefunc, mododepagto, id, idsind, taxasind, salariototal);
        this.salariomensal = salariomensal;
    }

    public double getSalarioBase(){
        return salariomensal;
    }

    public void setSalarioBase(double salariomensal){
        this.salariomensal = salariomensal;
    }

    public void calcSalary(int id){
        int auxsalary = 0;
        auxsalary += salariomensal;
        //salariototal += auxsalary;
    }

}