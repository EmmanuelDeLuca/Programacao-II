import java.util.Scanner;
public class QuintaQuestao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite 1 para somar;");
    System.out.println("Digite 2 para subtrair;");
    System.out.println("Digite 3 para multiplicar;");
    System.out.println("Digite 4 para divir;");
    
    int opcao = scanner.nextInt();

    System.out.println("Insira o primeiro valor:");
    int primeiroNumero = scanner.nextInt();

    System.out.println("Insira o segundo valor:");
    int segundoNumero = scanner.nextInt();

    int resultado;

    switch (opcao) {
      case (1):
        resultado = primeiroNumero + segundoNumero;
        System.out.println("Soma: " + resultado);
        break;
      case (2):
        resultado = primeiroNumero - segundoNumero;
        System.out.println("Subtração: " + resultado);
        break;
      case (3):
        resultado = primeiroNumero * segundoNumero;
        System.out.println("Multiplicação: " + resultado);
        break;
      case (4):
        if (primeiroNumero != 0 && segundoNumero != 0) {
          resultado = primeiroNumero / segundoNumero;
          System.out.println("Divisão: " + resultado);
        }
        else {
          System.out.println("Divisão por zero.");
        }
        break;
      default:
        System.out.println("ERRO, opção inexistente");
        break;
    }


  }
  
}