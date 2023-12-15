import java.util.Scanner;

public class SegundaQuestao {
  public static void main(String[] args) {
    //Criando o objeto scanner
		Scanner scanner = new Scanner(System.in);
		
		//Solicitando entrada das notas
		
		System.out.println("Informe três notas, em sequência:");
		
		double primeiraNota = scanner.nextDouble();
		double segundaNota = scanner.nextDouble();
		double terceiraNota = scanner.nextDouble();
		
		final int QUANTIDADE_DE_NOTAS = 3;
		
		
		//Calculando a média
		
		double resultado = (primeiraNota + segundaNota + terceiraNota) / QUANTIDADE_DE_NOTAS;
		
		//Imprimindo a média
		
		System.out.printf("Média aritmética: %.0f", (resultado));
  }
}
