import java.util.ArrayList;

class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    double calcularSalario() {
        return salario;
    }
}

class Gerente extends Funcionario {
    double bonus;

    Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    double calcularSalario() {
        return salario + bonus;
    }
}

public class Empresa {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Ana", 3000));
        funcionarios.add(new Gerente("Carlos", 5000, 1500));
        funcionarios.add(new Funcionario("Maria", 2800));
        funcionarios.add(new Gerente("João", 4500, 1200));

        for (Funcionario f : funcionarios) {
            System.out.printf("%s - Salário: R$ %.2f%n", f.nome, f.calcularSalario());
        }
    }
}
