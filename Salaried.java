import java.util.Scanner;

public class Salaried extends Funcionario{

    private double salariomensal;

    Salaried(String nome, String endereco, String tipodefunc, String mododepagto, int id, double salariototal, double salariomensal){
        super(nome, endereco, tipodefunc, mododepagto, id, idsind, taxasind, salariototal);
        this.salariomensal = salariomensal;
    }

    public double getSalarioMensal(){
        return salariomensal;
    }

    public void setSalarioMensal(double salariomensal){
        this.salariomensal = salariomensal;
    }

    public void calcSalary(int id){
        int auxsalary = 0;
        auxsalary += salariomensal;
        salariototal += auxsalary;
    }

}