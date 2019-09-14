import menus.MenuSurfista;
import models.Etapa;
import models.Jogadores;
import models.Patrocinadores;
import models.Surfista;

import menus.MenuSurfista.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Execution {


    public static void main(String[] args){
        int menuOptions = 0;

        ArrayList<Surfista> surfistas = new ArrayList<>();
        ArrayList<Etapa> etapas = new ArrayList<>();
        ArrayList<Patrocinadores> patrocinadores = new ArrayList<>();
        ArrayList<Jogadores> jogadores = new ArrayList<>();

        MenuSurfista menuSurfista = new MenuSurfista();

        Scanner scanner = new Scanner(System.in);

        while(menuOptions != 5){

            System.out.println("Menu\n");
            System.out.println("1 - Cadastrar Surfista\n");
            System.out.println("2 - Cadastrar Etapa\n");
            System.out.println("3 - Cadastrar Patrocinadores\n");
            System.out.println("4 - Cadastrar Jogadores\n");
            System.out.println("5 - Sair");

            menuOptions = scanner.nextInt();


            switch (menuOptions) {
                case 1:
                    menuSurfista.mostrarMenuSurfista();
                    int escolha = scanner.nextInt();
                    switch (escolha) {
                        case 1:
                            Surfista surfista = menuSurfista.criarSurfista();
                            surfistas.add(surfista);
                            System.out.println("Surfista cadastrado com sucesso!");
                            break;
                        case 2:
                            System.out.println(surfistas.toString());
                            break;
                    }

                    break;
                case 2:
                    System.out.println("");
            }
        }
    }

}
