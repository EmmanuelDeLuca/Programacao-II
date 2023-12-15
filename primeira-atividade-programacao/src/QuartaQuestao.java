import java.util.Scanner;

public class QuartaQuestao {
  public static void main(String[] args) {
    //Criando o objeto scanner
		Scanner scanner = new Scanner(System.in);
		
		//Solicitando medidas ao usuário
		
		System.out.println("Insira a base:");
		int base = scanner.nextInt();


		System.out.println("Insira a altura:");
		int altura = scanner.nextInt();
		
		
		//Calculando a área do triângulo
		
		int area = (base * altura) / 2;
		
		//Imprimindo a área do triângulo
		
		System.out.println("Área do triângulo: " + area);
  }
}
