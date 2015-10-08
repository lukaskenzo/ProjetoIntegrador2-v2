package projeto;

import java.util.Scanner;

public class Projeto {

    static void comprar(Estoque combustivel) {
        System.out.printf("Digite o tipo de combustível: ");
        String tipo = in.next();

        if (tipo.equalsIgnoreCase("Gasolina")) {
            System.out.printf("Digite a quantidade em litros a ser abastecido: ");
            int litros = in.nextInt();
            System.out.printf("Digite o nome do funcionário: ");
            String nome = in.next();
            combustivel.setGasolina(litros);
            System.out.printf("%s retirou: %s litros, do tipo %s! \n",nome, litros, tipo);
        
        } else if (tipo.equalsIgnoreCase("Alcool")) {
            System.out.printf("Digite a quantidade em litros a ser abastecido: ");
            int litros = in.nextInt();
            System.out.printf("Digite o nome do funcionário: ");
            String nome = in.next();
            combustivel.setAlcool(litros);
            System.out.printf("%s retirou: %s litros, do tipo %s! \n",nome, litros, tipo);

        } else if (tipo.equalsIgnoreCase("Diesel")) {
            System.out.printf("Digite a quantidade em litros a ser abastecido: ");
            int litros = in.nextInt();
            System.out.printf("Digite o nome do funcionário: ");
            String nome = in.next();
            combustivel.setDiesel(litros);
            System.out.printf("%s retirou: %s litros, do tipo %s! \n", nome, litros, tipo);
            
        }
        else{
            System.err.println("Tipo de combustível inexistente!");
        }
        
        
    }
    static void relatorio(Estoque combustivel){
        System.out.printf("Digite o tipo de combustível: ");
        String tipo = in.next();
        
        if (tipo.equalsIgnoreCase("Gasolina")) {
            System.out.println("Estoque atual de Gasolina: "+combustivel.getGasolina());
        
        } else if (tipo.equalsIgnoreCase("Alcool")) {
            System.out.println("Estoque atual de Álcool: "+combustivel.getAlcool());

        } else if (tipo.equalsIgnoreCase("Diesel")) {
            System.out.println("Estoque atual de Diesel: "+combustivel.getDiesel());
 
        }
        else{
            System.err.println("Tipo de combustível inexistente!");
        }
        

    }
    static Scanner in = new Scanner(System.in);

    static void opcoes() {
        System.out.println("DIGITE 1 PARA COMPRA DE COMBUTÍVEL;");
        System.out.println("DIGITE 2 PARA RELATÓRIO DE ESTOQUE;");
        System.out.println("DIGITE 0 PARA SAIR");
        System.out.println("");
    }

    static void cabecalho() {

        System.out.println("##########################");
        System.out.println("###    BEM-VINDO AO    ###");
        System.out.println("### SISTEMA DE ESTOQUE ###");
        System.out.println("###   DE COMBUSTÍVEL   ###");
        System.out.println("##########################");
        System.out.println("");
    }

    static void menu(Estoque combustivel) {
        int num = 3;
        while (num != 0) {
            System.out.printf("Digite a opção desejada: ");
            String opcao = in.next();
            switch (opcao) {
                case "1":
                    comprar(combustivel);
                    System.out.println("");
                    break;
                case "2":
                    relatorio(combustivel);
                    System.out.println("");
                    break;
                case "3":
                    System.out.println("");
                    System.err.println("3,2,1.. Sistema encerrado pelo usuário!");
                    System.exit(0);
                default:
                    System.out.println("OPÇÃO INVÁLIDA!! Digite uma das opções abaixo!");
                    System.out.println("");
                    opcoes();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Estoque combustivel = new Estoque();
        Funcionario funcionario = new Funcionario();
        
        cabecalho();
        opcoes();
        menu(combustivel);
    }
}
