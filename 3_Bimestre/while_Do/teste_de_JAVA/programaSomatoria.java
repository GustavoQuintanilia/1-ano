package projetoRepeticao;
import java.util.Scanner;
public class programaSomatoria {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=0, j=0;
		
		while(i <= 100) {
			
			j = j + i;
			i = i + 1; 
			System.out.println("A soma de " + j);
			
		}
	}

}
