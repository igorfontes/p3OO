import java.util.Scanner;
import java.util.ArrayList;

class main{
    public static void main(String[] args){

        int option;
        Scanner input = new Scanner(System.in);
        ArrayList<Funcionario> list = new ArrayList<>();
        Gerencia empresa = new Gerencia();

        while(true){

            System.out.print("Digite uma das opcoes abaixo:\n1 - adicionar funcionario\n2 - remover funcionario\n3 - set frequency card\n4 - add a selling\n5 - add a service fee\n6 - change data of an employee\n7 - update payroll and pay employees\n8 - undo\n9 - redo\n10 - set up payment agenda\n11 - create new agenda\n12 - exit\n");
            option = input.nextInt();
            
            switch(option){
                case 1:
                empresa.addFunc(list);
                break;
                case 2:
                empresa.removeFunc(list);
                break;
            }

            if(option == 12){
                break;
            }

        } 
    
    }
    
}