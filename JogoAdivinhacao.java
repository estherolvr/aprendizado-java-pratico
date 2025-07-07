import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Escolha a dificuldade:");
        System.out.println("1 - Fácil (10 tentativas)");
        System.out.println("2 - Médio (5 tentativas)");
        System.out.println("3 - Difícil (3 tentativas)");
        System.out.print("Opção: ");
        int dificuldade = sc.nextInt();

        int tentativas;
        switch (dificuldade) {
            case 1: tentativas = 10; break;
            case 2: tentativas = 5; break;
            case 3: tentativas = 3; break;
            default:
                System.out.println("Dificuldade inválida, usando Fácil.");
                tentativas = 10;
        }

        int numeroSecreto = rand.nextInt(100) + 1;
        int palpite;
        boolean acertou = false;

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            palpite = sc.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número.");
                acertou = true;
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }

        if (!acertou) {
            System.out.println("Suas tentativas acabaram! O número era: " + numeroSecreto);
        }
    }
}
