import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();
        int opcao;

        do {
            System.out.println("\n1. Adicionar cliente");
            System.out.println("2. Chamar próximo");
            System.out.println("3. Ver próximo da fila");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nome = sc.nextLine();
                    fila.add(nome);
                    System.out.println("Cliente adicionado à fila.");
                    break;
                case 2:
                    if (!fila.isEmpty()) {
                        System.out.println("Atendendo: " + fila.poll());
                    } else {
                        System.out.println("Fila vazia.");
                    }
                    break;
                case 3:
                    if (!fila.isEmpty()) {
                        System.out.println("Próximo: " + fila.peek());
                    } else {
                        System.out.println("Fila vazia.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
