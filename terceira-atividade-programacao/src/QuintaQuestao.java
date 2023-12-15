import java.util.Scanner;
public class QuintaQuestao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira um número:");
    int numeroPrimo = scanner.nextInt();

    boolean resultado = true;
    for(int contador = 2; contador < numeroPrimo; contador++){
      if (numeroPrimo % contador == 0){
        resultado = false;
        contador = numeroPrimo;
      }
    }
    if (resultado == false || numeroPrimo == 1){
      System.out.println(numeroPrimo + " não é primo.");
    }
    else{
      System.out.println(numeroPrimo + " é primo.");
    }
  }
}
