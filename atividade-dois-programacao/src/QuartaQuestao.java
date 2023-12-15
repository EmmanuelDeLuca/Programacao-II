import java.util.Scanner;
public class QuartaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro valor:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Insira o segundo valor:");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero == segundoNumero){
            int multiplicacao = primeiroNumero * segundoNumero;
            System.out.println("Multiplicação: " + multiplicacao);
        } else if (primeiroNumero > segundoNumero) {
            int subtracao = primeiroNumero - segundoNumero;
            System.out.println("Subtração: " + subtracao);
        }
        else {
            int soma = primeiroNumero + segundoNumero;
            System.out.println("Soma: " + soma);
        }

    }
}
