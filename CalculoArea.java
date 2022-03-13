package git;
import java.util.Scanner;

public class CalculoArea {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("BASEADO EM UM DOS LADOS!" + "\n" + "Valor da área que quer calcular? ");
			double lado = scan.nextInt();
			
			double area = (lado * lado);
				
				System.out.println("O valor da area é: " + area);
	}
}
