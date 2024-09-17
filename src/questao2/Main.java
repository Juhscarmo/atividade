package questao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma palavra ou frase: ");
		String str = scanner.nextLine();
		
		int quant = cont(str);
		if(quant > 0) {
			System.out.println("A letra 'a' aparece: " + quant + " vezes.");
		} else {
			System.out.println("A letra 'a' não aparece.");
		}
		
		scanner.close();
	}
	
	public static int cont(String str) {
		
		int aux = 0;
		for(char c : str.toCharArray()) {
			if(c == 'a' || c == 'A' || c == 'ã' || c == 'Ã' || 
					c == 'á' || c == 'Á' || c == 'à' || c == 'À' || c == 'â' || c == 'Â') { //incluindo acentuações
				aux++;
			}
		}		
		return aux;
	}
}
