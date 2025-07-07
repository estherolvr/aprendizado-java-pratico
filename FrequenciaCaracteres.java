import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequenciaCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase ou palavra: ");
        String texto = sc.nextLine();

        Map<Character, Integer> frequencia = new HashMap<>();

        for (char c : texto.toCharArray()) {
            frequencia.put(c, frequencia.getOrDefault(c, 0) + 1);
        }

        System.out.println("Frequência dos caracteres:");
        for (Map.Entry<Character, Integer> entry : frequencia.entrySet()) {
            System.out.println("'" + entry.getKey() + "' = " + entry.getValue());
        }
    }
}
