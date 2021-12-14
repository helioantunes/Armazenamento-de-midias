package view;

import java.util.*;
import model.CD;
import model.DVD;
import model.Midia;
import Controller.ControllerCD;
import Controller.ControllerDVD;

public class Main {

    public static Midia midia;

    public static void main(String args[]) {
        ControllerCD controllerCD = new ControllerCD();
        ControllerDVD controllerDVD = new ControllerDVD();

        Scanner input = new Scanner(System.in);
        System.out.println("SISTEMA DE GERENCIAMENTO DE MIDIAS");

        int opcaoMidia;
        do {
            System.out.println("Selecione uma opção: "
                    + "\n 1-Inserir CD"
                    + "\n 2-Inserir DVD"
                    + "\n 3-Pesquisar por um CD"
                    + "\n 4-Pesquisar por um DVD"
                    + "\n 5-Mostrar todas as midias"
                    + "\n 6-Remover CD"
                    + "\n 7-Remover DVD"
                    + "\n 8-Sair"
            );

            opcaoMidia = input.nextInt();

        switch (opcaoMidia) {

            case 1: {

                System.out.println("Informe o nome do CD: ");
                input.nextLine();
                String nomeCD = input.nextLine();

                System.out.println("Informe o codigo do CD: ");
                int codigo = input.nextInt();

                System.out.println("Informe o preço do CD: ");
                double preco = input.nextDouble();

                System.out.println("Informe o numero de faixas desse CD: ");
                int numeroFaixas = input.nextInt();

                CD cd = new CD(codigo, numeroFaixas, preco, nomeCD);
                controllerCD.adicionarCD(cd);
                break;
            }

            case 2:{
                System.out.println("Informe o nome do DVD: ");
                input.nextLine();
                String nomeDVD = input.nextLine();

                System.out.println("Informe o codigo do DVD: ");
                int codigo = input.nextInt();

                System.out.println("Informe o preço do DVD: ");
                double preco = input.nextDouble();

                System.out.println("Informe a sinopse do DVD: ");
                input.nextLine();
                String sinopse = input.nextLine();

                DVD dvd = new DVD(codigo, preco, nomeDVD, sinopse);
                controllerDVD.adicionarDVD(dvd);
                break;
            }
            case 3: {
                if (controllerCD.getCds() == null) {
                    System.out.println("Nenhum cd foi cadastrado!");
                } else {
                    System.out.println("Digite nome do cd que deseja encontrar: ");
                    input.nextLine();
                    String nome = input.nextLine();

                    CD cd = controllerCD.getCDsPorNome(nome);

                    if(cd != null) {
                        System.out.println(cd.getDetalhes());
                    } else {
                        System.out.println("Este cd não foi encontrado no banco de dados!");
                    }
                }
                break;
                }
            case 4: {
                if (controllerDVD.getDvds() == null) {
                    System.out.println("Nenhum DVD foi cadastrado!");
                } else {
                    System.out.println("Digite o nome do DVD que deseja encontrar: ");
                    input.nextLine();
                    String nome = input.nextLine();

                    DVD dvd = controllerDVD.getDVDsPorNome(nome);

                    if(dvd != null) {
                        System.out.println(dvd.getDetalhes());
                    } else {
                        System.out.println("Este dvd não foi encontrado no banco de dados!");
                    }
                }
                break;
                }
            case 5:{
                if (controllerCD.getQuantidadeCDsInseridos() == 0 || controllerDVD.getQuantidadeDVDsInseridos() == 0) {
                    System.out.println("CD ou DVD estão sem dados!");
                } else {
                    System.out.println("Todas as midias: ");
                    for (int i = 0; i < controllerDVD.getQuantidadeDVDsInseridos(); i++) {
                        DVD dvd = controllerDVD.getDvds()[i];
                        System.out.println(dvd.getDetalhes());
                        System.out.println(dvd.getTipo());
                        System.out.println("*************************************");
                    }
                    for (int a = 0; a < controllerCD.getQuantidadeCDsInseridos(); a++) {
                        CD cd = controllerCD.getCds()[a];
                        System.out.println(cd.getDetalhes());
                        System.out.println(cd.getTipo());
                        System.out.println("*************************************");
                    }
                }
                break;
                }
            case 6: {
                System.out.println("Informe o nome do CD: ");
                input.nextLine();
                String nome = input.nextLine();

                controllerCD.removerCD(nome);
                break;
            }
            case 7: {
                System.out.println("Informe o nome do DVD:");
                input.nextLine();
                String nome = input.nextLine();

                controllerDVD.removerDVD(nome);
                break;
            }
            }
        }while (opcaoMidia != 8);
    }
}
