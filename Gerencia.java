import java.util.Scanner;

public class Gerencia{

    static Scanner input = new Scanner(System.in);
    static String auxnome;
    static String auxmododepagto;
    static String auxtipodefunc;
    static String auxendereco;
    static int sind;
    static Double auxtaxasind;
    static Double auxsalariohora;

    public static Funcionario addFunc(){

        System.out.println("Digite o nome do funcionario e pressione enter:");
        auxnome = input.nextLine();
        System.out.println("Digite o endereco do funcionario e pressione enter:");
        auxendereco = input.nextLine();
        System.out.println("Digite o modo de pagamento(chequeemmaos, chequeporcorreio, deposito) do funcionario e pressione enter:");
        auxmododepagto = input.nextLine();
        System.out.println("Se o funcionario desejar fazer parte do sindicato, digite 1. Caso contrário, digite 0.");
        sind = input.nextInt();
        auxtaxasind = 0.0;
        if(sind == 1){
        System.out.printf("Digite a taxa sindical e pressione enter:");
        auxtaxasind = input.nextDouble();
        }
        input.nextLine();
        System.out.println("Digite o tipo (h - horista, a - assalariado, c - comissionado) do funcionario e pressione enter:");
        auxtipodefunc = input.nextLine();
        switch(auxtipodefunc){
            case "h":
            System.out.printf("Digite o valor do salario-hora e pressione enter:");
            auxsalariohora = input.nextDouble(); 
            Funcionario auxhorista = new Horista(auxnome, auxendereco, auxtipodefunc, auxmododepagto, 0, 0, auxtaxasind, 0, 0, auxsalariohora);
            return auxhorista;
            case "a": 
            System.out.println("ok a");
            Funcionario auxh = new Horista(auxnome, auxendereco, auxtipodefunc, auxmododepagto, 0, 0, 0, 0, 0, 0);
            return auxh;
            case "c": 
            System.out.println("ok c");
            Funcionario auxbl = new Horista(auxnome, auxendereco, auxtipodefunc, auxmododepagto, 0, 0, 0, 0, 0, 0);
            return auxbl;
        }

        Funcionario auxhor = new Horista(auxnome, auxendereco, auxtipodefunc, auxmododepagto, 0, 0, 0, 0, 0, 0);
        return auxhor;
        
    }
    
}