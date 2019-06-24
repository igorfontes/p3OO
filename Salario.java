import java.util.ArrayList;
import java.util.Scanner;

public class Salario{
    static Scanner input = new Scanner(System.in);

    public static void lancaPonto(ArrayList<Funcionario> list){
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
            double auxsalary = 0;
            if(horastrabal>=8){
                auxsalary += (list.get(auxfuncposition).getSalarioBase()*(horastrabal-8)*1.5 + list.get(auxfuncposition).getSalarioBase()*8);
            } else {
                auxsalary += list.get(auxfuncposition).getSalarioBase()*horastrabal;
            }
            double auxsalariototal = list.get(auxfuncposition).getSalarioTotal() + auxsalary;
            list.get(auxfuncposition).setSalarioTotal(auxsalariototal);
            System.out.printf("O salario do funcionario com id %d e ate agora %.2f\n",list.get(auxfuncposition).getId(),list.get(auxfuncposition).getSalarioTotal());
            break;
           }
       }
    }

    public static void addVenda(ArrayList<Funcionario> list){
        System.out.print("Digite o id do funcionario:");
        int auxilid = input.nextInt();
        System.out.print("Digite o dia atual:");
        int dia = input.nextInt();
        System.out.print("Digite o mes atual:");
        int mes = input.nextInt();
        System.out.print("Digite o ano atual com 4 digitos:");
        int ano = input.nextInt();
        System.out.print("Digite o valor da venda:");
        double valorvenda = input.nextDouble(); 
        System.out.print("Digite o valor do percentual em comissoes(digite a porcentagem como um decimal com virgula. Exemplo: 25,7 para 25,7 por cento) e pressione enter:");
        double auxpercentcomis = input.nextDouble();
        int auxfuncposition;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()==auxilid) {
                auxfuncposition = i;
                double auxsalary = 0;
                auxsalary += (valorvenda*auxpercentcomis/100);
                double auxsalariototal = list.get(auxfuncposition).getSalarioTotal() + auxsalary;
                list.get(auxfuncposition).setSalarioTotal(auxsalariototal);
                System.out.printf("O salario do funcionario com id %d e ate agora %.2f\n",list.get(auxfuncposition).getId(),list.get(auxfuncposition).getSalarioTotal());
                break;
            }
        }  
    }

    public static void cobrarTaxa(ArrayList<Funcionario> list){
        System.out.print("Digite o id do funcionario:");
        int auxilid = input.nextInt();
        System.out.print("Digite o valor da taxa extra de servico:");
        double taxaextra = input.nextDouble();
        int auxfuncposition;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()==auxilid) {
                auxfuncposition = i;
                double auxsalary = 0;
                auxsalary -= (taxaextra);
                double auxsalariototal = list.get(auxfuncposition).getSalarioTotal() + auxsalary;
                list.get(auxfuncposition).setSalarioTotal(auxsalariototal);
                System.out.printf("O salario do funcionario com id %d e ate agora %.2f\n",list.get(auxfuncposition).getId(),list.get(auxfuncposition).getSalarioTotal());
                break;
            }
        }
    }

}