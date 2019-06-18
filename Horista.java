import java.util.Scanner;

public class Horista extends Funcionario{

    private int horastrabal;
    private double salariohora;

    Horista(String nome, String endereco, String tipodefunc, String mododepagto, int id, int idsind, double taxasind, double salariototal, int horastrabal, double salariohora){
        super(nome, endereco, tipodefunc, mododepagto, id, idsind, taxasind, salariototal);
        this.horastrabal = horastrabal;
        this.salariohora = salariohora;
    }

    public int getHorasTrabal(){
        return horastrabal;
    }

    public double getSalarioHora(){
        return salariohora;
    }

    public void setHorasTrabal(int horastrabal){
        this.horastrabal = horastrabal;
    }

    public void setSalarioHora(double salariohora){
        this.salariohora = salariohora;
    }

    // public void lancaPonto(){
    //     System.out.print("Digite o id:");
    //     System.out.print("Digite o dia atual:");
    //     System.out.print("Digite o mes atual:");
    //     System.out.print("Digite o ano atual:");
    //     System.out.print("Digite o numero de horas trabalhadas nessa data:");
    //     //horastrabal += input.nextInt();
    //     calcSalary();
    //     //horastrabal = 0; //lembrar de setar horas trabalhadas como 0 apos calcsal
    // }

    public void calcSalary(int id){
        int auxsalary = 0;
        if(horastrabal>=8){
            auxsalary += (salariohora*(horastrabal-8) + salariohora*8*1.5);
        } else {
            auxsalary += salariohora*horastrabal;
        }
        //salariototal += auxsalary;

    }

}