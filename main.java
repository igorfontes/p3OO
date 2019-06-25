import java.util.Scanner;
import java.util.ArrayList;

class main{
    public static void main(String[] args){

        int option;
        Scanner input = new Scanner(System.in);
        ArrayList<Funcionario> list = new ArrayList<>();
        //Gerencia empresa = new Gerencia();
        //Salario calcSalario = new Salario();

        while(true){

            System.out.print("\nDigite uma das opcoes abaixo:\n1 - adicionar funcionario\n2 - remover funcionario\n3 - lancar ponto\n4 - adicionar venda\n5 - cobrar taxa extra\n6 - mudar dados do funcionario\n7 - roda folha\n8 - undo\n9 - redo\n10 - escolher agenda de pagamento\n11 - create new agenda\n12 - sair\n");
            option = input.nextInt();
            
            switch(option){
                case 1:
                Gerencia.addFunc(list);
                break;
                case 2:
                Gerencia.removeFunc(list);
                break;
                case 3:
                Salario.lancaPonto(list);
                break;
                case 4:
                Salario.addVenda(list);
                break;
                case 5:
                Salario.cobrarTaxa(list);
                break;
                case 6:
                Gerencia.mudaDados(list);
                break;
                case 7:
                Agenda.rodaFolha(list);
                break;
                case 10:
                Agenda.escolheAgenda(list);
                break;

            }

            if(option == 12){
                break;
            }

        } 
    
    }
    
}