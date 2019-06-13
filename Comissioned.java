import java.util.Scanner;

public class Comissioned extends Funcionario{

    private double salariocomsemanal;
    private double percentcomis;

    Comissioned(String nome, String endereco, String tipodefunc, String mododepagto, int id, double salariototal, double salariocomsemanal){
        super(nome, endereco, tipodefunc, mododepagto, id, idsind, taxasind, salariototal);
        this.salariocomsemanal = salariocomsemanal;
        this.percentcomis = percentcomis;
    }

    public double getSalarioComSemanal(){
        return salariocomsemanal;
    }

    public void setSalarioComSemanal(double salariocomsemanal){
        this.salariocomsemanal = salariocomsemanal;
    }

    public void lancaVenda(int id){
        Double auxvenda;
        System.out.print("Digite o id:");
        System.out.print("Digite o dia atual:");
        System.out.print("Digite o mes atual:");
        System.out.print("Digite o ano atual:");
        System.out.print("Digite o valor da venda:");
        auxvenda = input.nextDouble();
        System.out.print("Digite o valor da porcentagem da comissao:");
        percentcomis = input.nextDouble();
        salariototal += auxvenda*percentcomis;
    }

    public void calcSalary(int id){
        int auxsalary = 0;
        auxsalary += salariomensal;
        salariototal += auxsalary;

    }

}