import java.util.Scanner;
public class TerceiraQuestao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int contador = 0;
    System.out.println("Insira um número:");
    int numero = scanner.nextInt();

    while (numero != 0) {
      if (numero > 0) {
        contador++;
      }
      System.out.println("Insira um número:");
      numero = scanner.nextInt();
    }
    System.out.println("Quantidade de positivos: " + contador);
    
  }
}
