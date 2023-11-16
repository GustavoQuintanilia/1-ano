package laco2;
import java.util.Scanner;
public class programaAltura {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double i=134, j=145 ;
		int k = 1;
		
		while (i <= j) {
			i = i + 2.5;
			j = j + 2;
			k = k +1;
		}
		System.out.println("João demorou "+ k +" anos para ficar maior que Pedro. Onde João ficou com "
		+i +" cm e Pedro com "+j +"cm.");
	}

}


