package projetoRepeticao;
import java.util.Scanner;
public class programaIdade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=1, maior=0, menor=0, idade;
		
		while(i <= 10) {
			System.out.println("Qual a sua idade?");
			idade = ler.nextInt();
			if (idade < 18) {
				menor = menor + 1;
			} else {
				maior = maior + 1;
			}
			i = i + 1;
			
			
			
		}
		System.out.println(maior +" são maiores de idade e "+ menor +" são menores de idade");
	}

}
