package laco2;
import java.util.Scanner;
public class programaPotencia {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int b, e;
		int i=0, p=1;
		
		System.out.println("Entre com uma base:");
 		b= ler.nextInt();
 		
 		System.out.println("Entre com um expoente:");
 		e= ler.nextInt();

 		while (i<=e) {
 			
 			p= b*b ;
 			
 			i++;	
 		}
 		System.out.println("A "+ e+"º" + " potência de "+b +" é "+p);
	}
		

}
