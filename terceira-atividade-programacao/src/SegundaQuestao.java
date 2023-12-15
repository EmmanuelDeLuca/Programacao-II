import java.util.Scanner;
public class SegundaQuestao {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira o valor de A:");
    int valorDeA = scanner.nextInt();

    System.out.println("Insira o valor de B:");
    int valorDeB = scanner.nextInt();

    String sequencia = "";

    for(int contador = valorDeA + 1; contador < valorDeB; contador++){
      if(contador == valorDeA + 1){
        sequencia = String.valueOf(contador);
      }
      else {
        sequencia = sequencia + " " + String.valueOf(contador);
      }
      
    }

    System.out.println("Série numérica:");
    System.out.println(sequencia);
  } 


  
}
