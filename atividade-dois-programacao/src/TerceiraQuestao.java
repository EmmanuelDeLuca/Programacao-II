import java.util.Scanner;
public class TerceiraQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int numero = scanner.nextInt();

        int resto = numero%2;
        if (resto != 0){
            System.out.println(numero+" é impar.");
        }
        else {
            System.out.println(numero + " é par.");
        }
    }
}
