import java.util.Scanner;
public class PrimeiraQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero > segundoNumero){
            System.out.println("O maior é: " + primeiroNumero);
        } else if (segundoNumero > primeiroNumero) {
            System.out.println("O maior é: " + segundoNumero);
        }
        else {
            System.out.println("Os números são iguais");
        }
    }
}
