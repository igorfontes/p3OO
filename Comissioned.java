import java.util.Scanner;

public class Comissioned extends Funcionario{

    private double salariocommensal;
    private double percentcomis;

    Comissioned(String nome, String endereco, String tipodefunc, String mododepagto, int id, int idsind, double taxasind, double salariototal, double salariocommensal, double percentcomis){
        super(nome, endereco, tipodefunc, mododepagto, id, idsind, taxasind, salariototal);
        this.salariocommensal = salariocommensal;
        this.percentcomis = percentcomis;
    }

    public double getSalarioComMensal(){
        return salariocommensal;
    }

    public void setSalarioComMensal(double salariocommensal){
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

    public void calcSalary(int id){
        int auxsalary = 0;
        auxsalary += salariocommensal;
        //Funcionario.setSalarioTotal(Funcionario.getSalarioTotal() + auxsalary);

    }

}