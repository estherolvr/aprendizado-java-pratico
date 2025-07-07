import java.util.Scanner;

public class NumerosPrimos {
    static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.println("Números primos entre " + a + " e " + b + ":");
        for (int i = a; i <= b; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
