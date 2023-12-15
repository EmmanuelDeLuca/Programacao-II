import java.util.Scanner;
public class QuartaQuestao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira o valor de A:");
    int valorDeA = scanner.nextInt();

    System.out.println("Insira o valor de B:");
    int valorDeB = scanner.nextInt();

    for(int contador = valorDeA; contador <= valorDeB; contador++){
      if(contador % 2 != 0){
        System.out.println("É impar: " + contador);
      }
    }
  }
}
