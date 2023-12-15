import java.lang.Math;
import java.util.Scanner;

public class QuintaQuestao {
  public static void main(String[] args) {
    //Criando o objeto scanner
		Scanner scanner = new Scanner(System.in);
		
		//Solicitando números ao usuário
		
		System.out.println("Insira o primeiro número:");
		int base = scanner.nextInt();


		System.out.println("Insira o segundo número:");
		int expoente = scanner.nextInt();
		
		
		//Calculando
		
		double resultado = Math.pow(base, expoente);
		
		//Imprimindo o resultado
		
		System.out.printf("Resultado: %.0f", resultado);
  }
}
