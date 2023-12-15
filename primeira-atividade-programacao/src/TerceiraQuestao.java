import java.util.Locale;
import java.util.Scanner;

public class TerceiraQuestao {
  public static void main(String[] args) {
    //Criando o objeto scanner
		Scanner scanner = new Scanner(System.in);
		
		//Solicitando salário do funcionário
		
		System.out.println("Insira o salário:");
		
		int salario = scanner.nextInt();
		
		final double AUMENTO = 0.25;
		
		
		//Calculando a média
		
		double resultado = (salario * AUMENTO) + salario;
		
		//Imprimindo novo salário
		
		System.out.printf("Novo salário: %.0f", (resultado));
  }
}
