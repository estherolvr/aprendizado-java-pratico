import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    String nome;
    String email;
    String senha;

    Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
}

public class CadastroUsuarios {
    static boolean senhaValida(String senha) {
        return senha.length() >= 8 && senha.matches(".*[A-Z].*") && senha.matches(".*\\d.*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();

        System.out.print("Quantos usuários deseja cadastrar? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            String senha;
            do {
                System.out.print("Senha (mínimo 8 caracteres, 1 maiúscula e 1 número): ");
                senha = sc.nextLine();
            } while (!senhaValida(senha));
            usuarios.add(new Usuario(nome, email, senha));
        }

        System.out.println("Usuários cadastrados:");
        for (Usuario u : usuarios) {
            System.out.println(u.nome + " - " + u.email);
        }
    }
}
