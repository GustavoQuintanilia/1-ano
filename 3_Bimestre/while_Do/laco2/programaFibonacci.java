package laco2;
import java.util.Scanner;
public class programaFibonacci {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int n;
		int i=1, j=0;
		
		System.out.println("Entre com um número:");
 		n= ler.nextInt();

 		while (n!=0) {
 			i= i+j;
 			j = i - j;
 			
 			n--;
 			
 		}
 		System.out.println("O Fibonacci é "+j);
	}

}
