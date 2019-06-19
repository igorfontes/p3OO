import java.util.ArrayList;
import java.util.Scanner;

public class Gerencia{

    static int contafunc = 0;
    static int contasind = 0;
    static Scanner input = new Scanner(System.in);
    static String auxnome;
    static String auxmododepagto;
    static String auxtipodefunc;
    static String auxendereco;
    static int auxid;
    static int auxidsind;
    static int sind;
    static double auxtaxasind;
    static double auxsalariohora;
    static double auxsalariomensal;
    static double auxpercentcomis;
    static double auxsalariocommensal;
    
    public static void addFunc(ArrayList<Funcionario> list){

        auxid = contafunc;
        contafunc++;
        System.out.print("Digite o nome do funcionario e pressione enter:");
        input.nextLine();
        auxnome = input.nextLine();
        System.out.print("Digite o endereco do funcionario e pressione enter:");
        auxendereco = input.nextLine();
        System.out.print("Digite o modo de pagamento(chequeemmaos, chequeporcorreio, deposito) do funcionario e pressione enter:");
        auxmododepagto = input.nextLine();
        System.out.print("Se o funcionario desejar fazer parte do sindicato, digite 1. Caso contrário, digite 0 :");
        sind = input.nextInt();
        auxtaxasind = 0.0;
        if(sind == 1){
        auxidsind = contasind;
        contasind++;
        System.out.print("Digite a taxa sindical e pressione enter:");
        auxtaxasind = input.nextDouble();
        System.out.printf("Seu id no sindicato e: %d\n", auxidsind);
        }
        System.out.printf("Seu id na empresa e: %d\n", auxid);
        input.nextLine();
        System.out.print("Digite o tipo (h - horista, a - assalariado, c - comissionado) do funcionario e pressione enter:");
        auxtipodefunc = input.nextLine();
        switch(auxtipodefunc){
            case "h":
            System.out.print("Digite o valor do salario-hora e pressione enter:");
            auxsalariohora = input.nextDouble();
            Funcionario auxhorista = new Horista(auxnome, auxendereco, auxtipodefunc, auxmododepagto, auxid, auxidsind, auxtaxasind, 0, 0, auxsalariohora);
            list.add(auxhorista);
            return;
            case "a": 
            System.out.print("Digite o valor do salario mensal fixo e pressione enter:");
            auxsalariomensal = input.nextDouble(); 
            Funcionario auxsalaried = new Salaried(auxnome, auxendereco, auxtipodefunc, auxmododepagto, auxid, auxidsind, auxtaxasind, 0, auxsalariomensal);
            list.add(auxsalaried);
            return;
            case "c": 
            System.out.print("Digite o valor do salario mensal fixo e pressione enter:");
            auxsalariocommensal = input.nextDouble();
            System.out.print("Digite o valor do percentual em comissoes(digite a porcentagem como um decimal com virgula. Exemplo: 25,7 para 25,7 por cento) e pressione enter:");
            auxpercentcomis = input.nextDouble();
            Funcionario auxcomissioned = new Comissioned(auxnome, auxendereco, auxtipodefunc, auxmododepagto, auxid, auxidsind, auxtaxasind, 0, auxsalariocommensal, auxpercentcomis);
            list.add(auxcomissioned);
            return;
        }
        
    }

    public static void removeFunc(ArrayList<Funcionario> list) {
        System.out.print("Digite o id do funcionario a ser removido:\n");
        int auxremove = input.nextInt();
        // Funcionario aux = new list.get(auxremove);
        // System.out.printf("O nome do funcionario com id %d e %s\n", aux.getId() ,aux.getNome());
        int searchListLength = list.size();
        for (int i = 0; i < searchListLength; i++) {
            System.out.printf("O nome do funcionario com id %d\n", list.get(i).getId());
            // if (list.get(i).getId()==auxremove) {
            //     System.out.printf("O nome do funcionario com id\n");
            //     list.remove(i);
            // }
        }

    }
    
}