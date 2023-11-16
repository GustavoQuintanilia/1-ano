package atividade_switch;
import java.util.Scanner;
public class programaFutebol {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Escreva a idade do aluno:");
		idade = ler.nextInt();
		switch(idade) {
			case 6:
				System.out.println("Sua categoria é dente de leite.");
				break;
			case 7:
				System.out.println("Sua categoria é júnior.");
				break;
			case 8:
				System.out.println("Sua categoria é júnior max.");
				break;
			case 9:
				System.out.println("Sua categoria é júnior master.");
				break;
			case 10:
				System.out.println("Sua categoria é master.");
				break;
			default:
				System.out.println("Idade inválida");
		}
		ler.close();
	}

}

	
		


