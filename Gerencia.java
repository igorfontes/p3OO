import java.util.Scanner;

public class Gerencia{

    static Scanner input = new Scanner(System.in);
    static String auxnome;

    public static void addFunc(){

        System.out.println("Digite o nome do funcionario e pressione enter:");
        auxnome = input.nextLine();
        System.out.println("Digite o endereco do funcionario e pressione enter:");
        System.out.println("Digite o tipo (horista, assalariado, comissionado) do funcionario e pressione enter:");
    }
    
}