package menus;

import models.Surfista;

import java.util.Scanner;

public class MenuSurfista {

    private int escolha;

    public MenuSurfista() {

    }

    public void mostrarMenuSurfista(){
        System.out.println("\n1 - Cadastrar");
        System.out.println("\n2 - Consultar");
        System.out.println("\n3 - Atualizar");
        System.out.println("\n4 - Excluir");
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    /**
     * Função responsável por criar e retornar um Surfista
     * @return retorna o Surfista criado
     */
    public Surfista criarSurfista(){
        Surfista surfista = new Surfista();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do surfista");
        String nome = scanner.next();

        System.out.println("Insira o nickname do surfista");
        String nickname = scanner.next();

        System.out.println("Insira a idade do surfista");
        int idade = scanner.nextInt();

        System.out.println("Insira a nacionalidade do surfista");
        String nacionalidade = scanner.next();


        surfista.setNome(nome);
        surfista.setNickname(nickname);
        surfista.setIdade(idade);
        surfista.setNacionalidade(nacionalidade );

        return surfista;
    }
}
