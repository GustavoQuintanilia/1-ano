package projetoRepeticao;
import java.util.Scanner;
public class programaTabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=1, n, r;
		System.out.print("Escreva o número que deseja a tabuada");
		n = ler.nextInt();
		while(i <= 10) {
			r = n * i;
			System.out.println(n+" x "+i+" = "+r);
			i = i + 1;
		}
		ler.close();
	}
}
