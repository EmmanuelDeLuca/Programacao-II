import java.util.Scanner;
public class SegundaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        int segundoNumero = scanner.nextInt();

        System.out.println("Insira o terceiro número:");
        int terceiroNumero = scanner.nextInt();

        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero ) {
            System.out.println("Condição satisfeita");
        }
        else {
            System.out.println("Erro");
        }
    }
}
