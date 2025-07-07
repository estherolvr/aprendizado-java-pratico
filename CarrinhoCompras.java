import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nome;
    int quantidade;
    double preco;

    Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}

public class CarrinhoCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> carrinho = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Mostrar total da compra");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    System.out.print("Preço unitário: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();
                    carrinho.add(new Produto(nome, quantidade, preco));
                    System.out.println("Produto adicionado.");
                    break;
                case 2:
                    System.out.print("Nome do produto a remover: ");
                    String remover = sc.nextLine();
                    boolean removido = carrinho.removeIf(p -> p.nome.equalsIgnoreCase(remover));
                    if (removido) {
                        System.out.println("Produto removido.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    double total = 0;
                    for (Produto p : carrinho) {
                        total += p.preco * p.quantidade;
                    }
                    System.out.printf("Total da compra: R$ %.2f%n", total);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
