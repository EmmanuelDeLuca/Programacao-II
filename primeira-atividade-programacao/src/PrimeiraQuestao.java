import java.util.Scanner;

public class PrimeiraQuestao {
  public static void main(String[] args) {
    //Criando o objeto scanner
		Scanner scanner = new Scanner(System.in);
		
		//Solicitando entrada dos dados
		
		System.out.println("Informe quatro números, em sequência:");
		
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		int numero3 = scanner.nextInt();
		int numero4 = scanner.nextInt();
		
		//Calculando
		
		int resultado = numero1 + numero2 + numero3 + numero4;
		
		//Imprimindo o resultado
		
		System.out.println("Resultado da soma: " + resultado);
  }
}
