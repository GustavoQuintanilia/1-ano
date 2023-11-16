package laco2;
import java.util.Scanner;
public class programaFatorial {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int n;
		int  i=1;
		
		
		System.out.println("Entre com um número:");
 		n= ler.nextInt();
 		i=n;
 		
		while (n>1) {
			i = i*(n-1);
			
			
			
			n--;
		}
		System.out.println("O fatorial do número é igual a "+i);
		
	}
	
}


