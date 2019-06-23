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
    static int auxfuncposition;
    static double auxtaxasind;
    static double auxsalariohora;
    static double auxsalariomensal;
    static double auxpercentcomis;
    static double auxsalariocommensal;
    
    public static void addFunc(ArrayList<Funcionario> list){

        auxid = contafunc;
        contafunc++;
        System.out.print("Digite o nome do funcionario e pressione enter:");
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
            input.nextLine();
            Funcionario auxhorista = new Horista(auxnome, auxendereco, auxtipodefunc, auxmododepagto, auxid, auxidsind, auxtaxasind, 0, auxsalariohora, "semanalmente", 0, "");
            list.add(auxhorista);
            return;
            case "a": 
            System.out.print("Digite o valor do salario mensal fixo e pressione enter:");
            auxsalariomensal = input.nextDouble();
            input.nextLine(); 
            Funcionario auxsalaried = new Salaried(auxnome, auxendereco, auxtipodefunc, auxmododepagto, auxid, auxidsind, auxtaxasind, 0, auxsalariomensal, "mensalmente", 0, "");
            list.add(auxsalaried);
            return;
            case "c": 
            System.out.print("Digite o valor do salario mensal fixo e pressione enter:");
            auxsalariocommensal = input.nextDouble();
            System.out.print("Digite o valor do percentual em comissoes(digite a porcentagem como um decimal com virgula. Exemplo: 25,7 para 25,7 por cento) e pressione enter:");
            auxpercentcomis = input.nextDouble();
            input.nextLine();
            Funcionario auxcomissioned = new Comissioned(auxnome, auxendereco, auxtipodefunc, auxmododepagto, auxid, auxidsind, auxtaxasind, 0, auxsalariocommensal, auxpercentcomis, "bi-semanalmente", 0, "");
            list.add(auxcomissioned);
            return;
        }
        
    }

    public static void removeFunc(ArrayList<Funcionario> list) {
        System.out.print("Digite o id do funcionario a ser removido:\n");
        int auxremove = input.nextInt();
        int removivel = 1; // verifica se o func existe
        input.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()==auxremove) {
                System.out.printf("O funcionario %s com id %d foi removido com sucesso!\n", list.get(i).getNome(),list.get(i).getId());
                list.remove(i);
                return;
            }
        }
        removivel = 0;
        if(removivel == 0){
            System.out.print("Id nao encontrado (funcionario ja removido ou nunca adicionado)\n");
        }

    }

    public static void mudaDados(ArrayList<Funcionario> list) {
        int achou = 0; // indica se o funcionario existe ou nao
        System.out.print("Digite o id do funcionario cujos dados serao alterados:\n");
        int auxid = input.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()==auxid) {
                auxfuncposition = i;
                achou = 1;
                break;
            }
        }

        if(achou == 0){
            System.out.print("Id nao encontrado (funcionario removido ou nunca adicionado)\n");
            input.nextLine();
        }

        if(achou==1){
            System.out.print("Escolha uma das opcoes abaixo:\n1 - mudar nome\n2 - mudar endereco\n3 - mudar tipo de funcionario\n4 - mudar modo de pagamento\n5 - entrar ou sair do sindicato\n6 - mudar taxa sindical\n7 - mudar id no sindicato\n");
            int auxmuda = input.nextInt();
            switch(auxmuda){
                case 1:
                System.out.print("Digite o novo nome:");
                input.nextLine();
                auxnome = input.nextLine();
                list.get(auxfuncposition).setNome(auxnome);
                System.out.printf("Nome modificado para %s.\n",list.get(auxfuncposition).getNome());
                break;
                case 2:
                System.out.print("Digite o novo endereco:");
                input.nextLine();
                auxendereco = input.nextLine();
                list.get(auxfuncposition).setEndereco(auxendereco);
                System.out.printf("Endereco modificado para %s.\n",list.get(auxfuncposition).getEndereco());
                break;
                case 3: //QUANDO MUDA O TIPO COMO FAZ?
                System.out.print("Digite o novo tipo de funcionario:");
                input.nextLine();
                auxendereco = input.nextLine();
                list.get(auxfuncposition).setTipoDeFunc(auxtipodefunc);
                System.out.printf("Tipo de funcionario modificado para %s.\n",list.get(auxfuncposition).getTipoDeFunc());
                break;
                case 4:
                System.out.print("Digite o novo modo de pagamento:");
                input.nextLine();
                auxmododepagto = input.nextLine();
                list.get(auxfuncposition).setModoDePagto(auxmododepagto);
                System.out.printf("Modo de pagamento modificado para %s.\n",list.get(auxfuncposition).getModoDePagto());
                break;
                case 5:
                System.out.print("Digite 1 para fazer parte do sindicato ou 0 para sair:");
                input.nextLine();
                sind = input.nextInt();
                auxtaxasind = 0.0;
                if(sind == 1){
                    auxidsind = contasind;
                    contasind++;
                    System.out.print("Digite a taxa sindical e pressione enter:");
                    auxtaxasind = input.nextDouble();
                    System.out.printf("Seu id no sindicato e: %d\n", auxidsind);
                    list.get(auxfuncposition).setIdSind(auxidsind);
                }
                input.nextLine();
                list.get(auxfuncposition).setTaxaSind(auxtaxasind);
                System.out.printf("Sua taxa sindical e de %.2f.\n",list.get(auxfuncposition).getTaxaSind());
                break;
                case 6:
                System.out.print("Digite a nova taxa sindical e pressione enter:");
                auxtaxasind = input.nextDouble();
                input.nextLine();
                list.get(auxfuncposition).setTaxaSind(auxtaxasind);
                System.out.printf("Sua taxa sindical e de %.2f.\n",list.get(auxfuncposition).getTaxaSind());
                break;
                case 7:
                auxidsind = contasind;
                contasind++;
                System.out.printf("Seu novo id no sindicato e: %d\n", auxidsind);
                list.get(auxfuncposition).setIdSind(auxidsind);
                break;
    
            }
        }
        
    }
    
}