package questao1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o número que deseja verificar: ");
		int num = scanner.nextInt();
		
		if(fibonacci(num)) {
			System.out.println(num + " pertence a sequência Fibonacci!");
		} else {
			System.out.println(num + " não pertence a sequência Fibonacci!");
		}
		
		scanner.close();		
	}
	
	public static boolean fibonacci(int num) {
		if(num == 0 || num == 1) { //números garantidos na sequência
			return true;
		}
		
		int x = 0;
		int y = 1; 
		int fib = 1; 
		
		while(fib < num) { //atualizando os valores 
			fib = x + y;
			x = y;
			y = fib;
		}
		return fib == num;
	}
}
